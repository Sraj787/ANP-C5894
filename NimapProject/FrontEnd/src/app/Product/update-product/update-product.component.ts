import { Component } from "@angular/core";
import { ActivatedRoute, Router } from "@angular/router";
import { Product } from "src/app/Product";
import { ProductServiceService } from "src/app/Service/product-service.service";


@Component({
  selector: 'app-update-product',
  templateUrl: './update-product.component.html',
  styleUrls: ['./update-product.component.css']
})
export class UpdateProductComponent {

  productID!: number;
  //creating the object of the Employee
  product: Product = new Product();
  

  //creating constructor
  constructor(private productService:ProductServiceService,
    private router:Router,
    private route : ActivatedRoute){}
  
  ngOnInit(): void {
    
    this.productID = this.route.snapshot.params['productID'];

    this.productService.getProductById(this.productID).subscribe(data => {
      this.product = data;
    }, error => console.log(error));
    } 

  
  updateProduct(){
    this.productService.updateProduct(this.productID, this.product).subscribe(data=>
    {
      this.gotoProductList();
    },error => console.log(error));
  }
 
  onSubmit(){
    this.updateProduct();
  }

  gotoProductList(){
    this.router.navigate(['/products'])
  }
}
