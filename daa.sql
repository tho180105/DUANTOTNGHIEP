USE [DuAnTotNghiep]
GO
INSERT [dbo].[Role] ([RoleId], [RoleName]) VALUES (N'1', N'GUESS')
INSERT [dbo].[Role] ([RoleId], [RoleName]) VALUES (N'2', N'STAFF')
INSERT [dbo].[Role] ([RoleId], [RoleName]) VALUES (N'3', N'MANAGER')
INSERT [dbo].[Account] ([AccountId], [Password], [Email], [Avatar], [Coin], [PhoneNumber], [CreateDate], [Status], [RoleId]) VALUES (N'1', N'1', NULL, NULL, NULL, NULL, NULL, NULL, N'1')
SET IDENTITY_INSERT [dbo].[Category] ON 

INSERT [dbo].[Category] ([CategoryId], [CategoryName]) VALUES (1, N'Áo cổ tròn form rộng')
INSERT [dbo].[Category] ([CategoryId], [CategoryName]) VALUES (2, N'Áo thun 3 lỗ')
INSERT [dbo].[Category] ([CategoryId], [CategoryName]) VALUES (3, N'Áo thun cổ trụ')
INSERT [dbo].[Category] ([CategoryId], [CategoryName]) VALUES (4, N'Áo thun Sweater')
INSERT [dbo].[Category] ([CategoryId], [CategoryName]) VALUES (5, N'Áo thun tối giản')
SET IDENTITY_INSERT [dbo].[Category] OFF
SET IDENTITY_INSERT [dbo].[Style] ON 

INSERT [dbo].[Style] ([StyleId], [StyleName]) VALUES (1, N'Thanh lịch')
INSERT [dbo].[Style] ([StyleId], [StyleName]) VALUES (2, N'Dễ thương')
INSERT [dbo].[Style] ([StyleId], [StyleName]) VALUES (3, N'Thoải mái')
INSERT [dbo].[Style] ([StyleId], [StyleName]) VALUES (4, N'Gợi cảm')
SET IDENTITY_INSERT [dbo].[Style] OFF
SET IDENTITY_INSERT [dbo].[Product] ON 

INSERT [dbo].[Product] ([ProductId], [ProductName], [ListedPrice], [SellingPrice], [Describe], [MainProductImage], [StyleId], [CategoryId], [ProductStatusId]) VALUES (1, N'Áo Thun Cổ Tròn Đơn Giản Thần Cổ Đại Horus Ver1', 199, 139, NULL, N'pd_0001', 1, 1, NULL)
INSERT [dbo].[Product] ([ProductId], [ProductName], [ListedPrice], [SellingPrice], [Describe], [MainProductImage], [StyleId], [CategoryId], [ProductStatusId]) VALUES (2, N'Áo Thun Cổ Tròn Đơn Giản Thần Cổ Đại Horus Ver2', 159, 99, NULL, N'pd_0002', 1, 1, NULL)
INSERT [dbo].[Product] ([ProductId], [ProductName], [ListedPrice], [SellingPrice], [Describe], [MainProductImage], [StyleId], [CategoryId], [ProductStatusId]) VALUES (3, N'Áo Thun Cổ Tròn Đơn Giản Thần Cổ Đại Horus Ver3', 259, 199, NULL, N'pd_0003', 2, 1, NULL)
INSERT [dbo].[Product] ([ProductId], [ProductName], [ListedPrice], [SellingPrice], [Describe], [MainProductImage], [StyleId], [CategoryId], [ProductStatusId]) VALUES (4, N'Áo Thun Cổ Tròn Đơn Giản Thần Cổ Đại Horus Ver4', 339, 299, NULL, N'pd_0004', 2, 1, NULL)
INSERT [dbo].[Product] ([ProductId], [ProductName], [ListedPrice], [SellingPrice], [Describe], [MainProductImage], [StyleId], [CategoryId], [ProductStatusId]) VALUES (5, N'Áo Thun Cổ Tròn Đơn Giản Thần Cổ Đại Horus Ver5', 159, 139, N'Chất liệu: Cotton Compact
Thành phần: 100% Cotton', N'pd_0005', 3, 1, NULL)
INSERT [dbo].[Product] ([ProductId], [ProductName], [ListedPrice], [SellingPrice], [Describe], [MainProductImage], [StyleId], [CategoryId], [ProductStatusId]) VALUES (6, N'Áo Thun Cổ Tròn Đơn Giản Thần Cổ Đại Horus Ver6', 200, 159, NULL, N'pd_0006', 3, 1, NULL)
INSERT [dbo].[Product] ([ProductId], [ProductName], [ListedPrice], [SellingPrice], [Describe], [MainProductImage], [StyleId], [CategoryId], [ProductStatusId]) VALUES (7, N'Áo Thun Cổ Tròn Đơn Giản Thần Cổ Đại Horus Ver7', 160, 149, NULL, N'pd_0007', 4, 1, NULL)
INSERT [dbo].[Product] ([ProductId], [ProductName], [ListedPrice], [SellingPrice], [Describe], [MainProductImage], [StyleId], [CategoryId], [ProductStatusId]) VALUES (8, N'Áo Thun Cổ Tròn Đơn Giản Thần Cổ Đại Horus Ver8', 180, 129, NULL, N'pd_0008', 4, 1, NULL)
INSERT [dbo].[Product] ([ProductId], [ProductName], [ListedPrice], [SellingPrice], [Describe], [MainProductImage], [StyleId], [CategoryId], [ProductStatusId]) VALUES (9, N'Áo Thun Cổ Tròn Đơn Giản Thần Cổ Đại Horus Ver9', 209, 189, NULL, N'pd_0009', 1, 1, NULL)
INSERT [dbo].[Product] ([ProductId], [ProductName], [ListedPrice], [SellingPrice], [Describe], [MainProductImage], [StyleId], [CategoryId], [ProductStatusId]) VALUES (10, N'Áo Thun Cổ Tròn Đơn Giản Thần Cổ Đại Horus Ver10', 150, 119, NULL, N'pd_0010', 1, 1, NULL)
INSERT [dbo].[Product] ([ProductId], [ProductName], [ListedPrice], [SellingPrice], [Describe], [MainProductImage], [StyleId], [CategoryId], [ProductStatusId]) VALUES (11, N'Áo Thun 3 Lỗ Tối Giản M01', 160, 125, NULL, N'pd_0011', 2, 2, NULL)
INSERT [dbo].[Product] ([ProductId], [ProductName], [ListedPrice], [SellingPrice], [Describe], [MainProductImage], [StyleId], [CategoryId], [ProductStatusId]) VALUES (12, N'Áo Thun 3 Lỗ Tối Giản M02', 150, 123, NULL, N'pd_0012', 2, 2, NULL)
INSERT [dbo].[Product] ([ProductId], [ProductName], [ListedPrice], [SellingPrice], [Describe], [MainProductImage], [StyleId], [CategoryId], [ProductStatusId]) VALUES (13, N'Áo Thun 3 Lỗ Tối Giản M03', 299, 258, NULL, N'pd_0013', 3, 2, NULL)
INSERT [dbo].[Product] ([ProductId], [ProductName], [ListedPrice], [SellingPrice], [Describe], [MainProductImage], [StyleId], [CategoryId], [ProductStatusId]) VALUES (14, N'Áo Thun 3 Lỗ Tối Giản M04', 305, 261, NULL, N'pd_0014', 3, 2, NULL)
INSERT [dbo].[Product] ([ProductId], [ProductName], [ListedPrice], [SellingPrice], [Describe], [MainProductImage], [StyleId], [CategoryId], [ProductStatusId]) VALUES (15, N'Áo Thun 3 Lỗ Tối Giản M05', 198, 168, NULL, N'pd_0015', 4, 2, NULL)
INSERT [dbo].[Product] ([ProductId], [ProductName], [ListedPrice], [SellingPrice], [Describe], [MainProductImage], [StyleId], [CategoryId], [ProductStatusId]) VALUES (16, N'Áo Thun 3 Lỗ Tối Giản M06', 153, 125, NULL, N'pd_0016', 4, 2, NULL)
INSERT [dbo].[Product] ([ProductId], [ProductName], [ListedPrice], [SellingPrice], [Describe], [MainProductImage], [StyleId], [CategoryId], [ProductStatusId]) VALUES (17, N'Áo Thun 3 Lỗ Tối Giản M07', 185, 147, NULL, N'pd_0017', 1, 2, NULL)
INSERT [dbo].[Product] ([ProductId], [ProductName], [ListedPrice], [SellingPrice], [Describe], [MainProductImage], [StyleId], [CategoryId], [ProductStatusId]) VALUES (18, N'Áo Thun 3 Lỗ Tối Giản M08', 175, 158, NULL, N'pd_0018', 1, 2, NULL)
INSERT [dbo].[Product] ([ProductId], [ProductName], [ListedPrice], [SellingPrice], [Describe], [MainProductImage], [StyleId], [CategoryId], [ProductStatusId]) VALUES (19, N'Áo Thun 3 Lỗ Tối Giản M09', 176, 135, NULL, N'pd_0019', 2, 2, NULL)
INSERT [dbo].[Product] ([ProductId], [ProductName], [ListedPrice], [SellingPrice], [Describe], [MainProductImage], [StyleId], [CategoryId], [ProductStatusId]) VALUES (20, N'Áo Thun 3 Lỗ Tối Giản M10', 174, 128, NULL, N'pd_0020', 2, 2, NULL)
INSERT [dbo].[Product] ([ProductId], [ProductName], [ListedPrice], [SellingPrice], [Describe], [MainProductImage], [StyleId], [CategoryId], [ProductStatusId]) VALUES (21, N'Áo Thun Cổ Trụ Tối Giản M01', 189, 179, NULL, N'pd_0021', 3, 3, NULL)
INSERT [dbo].[Product] ([ProductId], [ProductName], [ListedPrice], [SellingPrice], [Describe], [MainProductImage], [StyleId], [CategoryId], [ProductStatusId]) VALUES (22, N'Áo Thun Cổ Trụ Tối Giản M02', 199, 169, NULL, N'pd_0022', 3, 3, NULL)
INSERT [dbo].[Product] ([ProductId], [ProductName], [ListedPrice], [SellingPrice], [Describe], [MainProductImage], [StyleId], [CategoryId], [ProductStatusId]) VALUES (23, N'Áo Thun Cổ Trụ Tối Giản M03', 280, 258, NULL, N'pd_0023', 4, 3, NULL)
INSERT [dbo].[Product] ([ProductId], [ProductName], [ListedPrice], [SellingPrice], [Describe], [MainProductImage], [StyleId], [CategoryId], [ProductStatusId]) VALUES (24, N'Áo Thun Cổ Trụ Tối Giản M04', 296, 247, NULL, N'pd_0024', 4, 3, NULL)
INSERT [dbo].[Product] ([ProductId], [ProductName], [ListedPrice], [SellingPrice], [Describe], [MainProductImage], [StyleId], [CategoryId], [ProductStatusId]) VALUES (25, N'Áo Thun Cổ Trụ Tối Giản M05', 185, 147, NULL, N'pd_0025', 1, 3, NULL)
INSERT [dbo].[Product] ([ProductId], [ProductName], [ListedPrice], [SellingPrice], [Describe], [MainProductImage], [StyleId], [CategoryId], [ProductStatusId]) VALUES (26, N'Áo Thun Cổ Trụ Tối Giản M06', 168, 158, NULL, N'pd_0026', 1, 3, NULL)
SET IDENTITY_INSERT [dbo].[Product] OFF
INSERT [dbo].[Size] ([SizeId], [Describe]) VALUES (N'L', NULL)
INSERT [dbo].[Size] ([SizeId], [Describe]) VALUES (N'M', NULL)
INSERT [dbo].[Size] ([SizeId], [Describe]) VALUES (N'XL', NULL)
SET IDENTITY_INSERT [dbo].[ProductRepository] ON 

INSERT [dbo].[ProductRepository] ([ProductRepositoryId], [Quantity], [SizeId], [ProductId]) VALUES (1, 10, N'M', 1)
INSERT [dbo].[ProductRepository] ([ProductRepositoryId], [Quantity], [SizeId], [ProductId]) VALUES (2, 20, N'L', 1)
INSERT [dbo].[ProductRepository] ([ProductRepositoryId], [Quantity], [SizeId], [ProductId]) VALUES (3, 25, N'XL', 1)
INSERT [dbo].[ProductRepository] ([ProductRepositoryId], [Quantity], [SizeId], [ProductId]) VALUES (4, 10, N'M', 2)
INSERT [dbo].[ProductRepository] ([ProductRepositoryId], [Quantity], [SizeId], [ProductId]) VALUES (5, 10, N'L', 2)
INSERT [dbo].[ProductRepository] ([ProductRepositoryId], [Quantity], [SizeId], [ProductId]) VALUES (6, 10, N'XL', 2)
SET IDENTITY_INSERT [dbo].[ProductRepository] OFF
SET IDENTITY_INSERT [dbo].[DetailCart] ON 

INSERT [dbo].[DetailCart] ([DetailCartId], [Quantity], [ProductRepositoryId], [AccountId]) VALUES (3, 1, 1, N'1')
INSERT [dbo].[DetailCart] ([DetailCartId], [Quantity], [ProductRepositoryId], [AccountId]) VALUES (4, 1, 2, N'1')
INSERT [dbo].[DetailCart] ([DetailCartId], [Quantity], [ProductRepositoryId], [AccountId]) VALUES (5, 1, 3, N'1')
INSERT [dbo].[DetailCart] ([DetailCartId], [Quantity], [ProductRepositoryId], [AccountId]) VALUES (6, 1, 4, N'1')
SET IDENTITY_INSERT [dbo].[DetailCart] OFF
