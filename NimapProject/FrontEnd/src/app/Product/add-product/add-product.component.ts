import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Product } from 'src/app/Product';
import { ProductServiceService } from 'src/app/Service/product-service.service';

@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css']
})
export class AddProductComponent {

  
  product: Product = new Product();

  constructor(private productService : ProductServiceService, private router:Router){
  }
  ngOnInit(): void {}
  
  saveProduct(){
    this.productService.Addproduct(this.product).subscribe(data=>{
      console.log(data);
      this.gotoProductList();
    },
    error => console.log(error));
}
  gotoProductList(){
    this.router.navigate(['/categories'])
  }

  onSubmit(){
    console.log(this.product);
    this.saveProduct();
  }
}
