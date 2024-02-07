import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { AddProductComponent } from './Product/add-product/add-product.component';
import { UpdateProductComponent } from './Product/update-product/update-product.component';
import { GetAllProductComponent } from './Product/get-all-product/get-all-product.component';
import { GetProductComponent } from './Product/get-product/get-product.component';
import { AddCategoryComponent } from './Category/add-category/add-category.component';
import { UpdateCategoryComponent } from './Category/update-category/update-category.component';
import { GetAllCategoryComponent } from './Category/get-all-category/get-all-category.component';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    AddProductComponent,
    UpdateProductComponent,
    GetAllProductComponent,
    GetProductComponent,
    AddCategoryComponent,
    UpdateCategoryComponent,
    GetAllCategoryComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
