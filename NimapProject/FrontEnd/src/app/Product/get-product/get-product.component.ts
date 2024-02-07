import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Category } from 'src/app/Category';
import { Product } from 'src/app/Product';
import { ProductServiceService } from 'src/app/Service/product-service.service';

@Component({
  selector: 'app-get-product',
  templateUrl: './get-product.component.html',
  styleUrls: ['./get-product.component.css']
})
export class GetProductComponent {

  productID!: number;
  //creating the object of the Employee
  productDetails:any;
  
  //creating constructor
  constructor(private productService:ProductServiceService,
    private router:Router,
    private route : ActivatedRoute){}
  
  ngOnInit(): void {
    this.productID = this.route.snapshot.params['productID'];

    this.productService.getProductById(this.productID).subscribe(response => {
      this.productDetails = response;
    }, error => console.log(error));
    } 

  gotoProductList(){
    this.router.navigate(['/products'])
  }
 
  onSubmit(){
    this.productService.getProductById(this.productID).subscribe(data=>{
      this.gotoProductList();
    },error=>console.log(error));
  }
}
