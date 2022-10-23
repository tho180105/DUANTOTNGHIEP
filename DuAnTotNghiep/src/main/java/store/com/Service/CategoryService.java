package store.com.Service;

import java.util.List;



import store.com.Entity.Category;


public interface CategoryService {
	public List<Category> findAll() ;

	public Category findById(String id) ;

	public Category create(Category category) ;

	public Category update(Category category) ;

	public void delete(String id) ;
}
