package store.com.Entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@SuppressWarnings("serial")
@Data
@Getter
@Setter
@Entity 
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Role")
public class Role implements Serializable{
	@Id
	String roleId;
	String rolename;
	@JsonIgnore
	@OneToMany(mappedBy = "role")
	List<Account> accounts;
}
