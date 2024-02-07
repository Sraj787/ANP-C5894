import { NgModule } from '@angular/core';

import { AddProductComponent } from './Product/add-product/add-product.component';
import { GetAllProductComponent } from './Product/get-all-product/get-all-product.component';
import { GetProductComponent } from './Product/get-product/get-product.component';
import { UpdateProductComponent } from './Product/update-product/update-product.component';
import { AddCategoryComponent } from './Category/add-category/add-category.component';
import { GetAllCategoryComponent } from './Category/get-all-category/get-all-category.component';
import { UpdateCategoryComponent } from './Category/update-category/update-category.component';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {path: '', redirectTo: 'products', pathMatch: 'full'},
  {path:'addproducts',component:AddProductComponent},
  {path:'products',component:GetAllProductComponent},
  {path:'getproducts/:productID',component:GetProductComponent},
  {path:'updateproducts/:productID',component:UpdateProductComponent},
  
  {path: '', redirectTo: 'categories', pathMatch: 'full'},
  {path:'addcategories',component:AddCategoryComponent},
  {path:'categories',component:GetAllCategoryComponent},
  {path:'categories/:categoryId',component:UpdateCategoryComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
