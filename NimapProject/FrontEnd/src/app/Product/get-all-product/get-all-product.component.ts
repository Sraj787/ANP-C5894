import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ProductServiceService } from 'src/app/Service/product-service.service';
import { Product } from '../../Product';

@Component({
  selector: 'app-get-all-product',
  templateUrl: './get-all-product.component.html',
  styleUrls: ['./get-all-product.component.css']
})
export class GetAllProductComponent {

  products!:Product[];

  constructor(private productServie:ProductServiceService,private router:Router,private route : ActivatedRoute)
  {

  }
  ngOnInit(): void {
   this.getProduct();
  }
  private getProduct(){
    this.productServie.getAll().subscribe(data =>
      {
        this.products=data;
      }, error => console.log(error))
  }


  ProductDetails(productID:number)
  {
    this.router.navigate(['/getproducts/',productID]);
  }
  updateProduct(productID:number)
  {
    this.router.navigate(['/updateproducts',productID]);
  }
  deleteProduct(productID:number)
  {
    this.productServie.deleteProduct(productID).subscribe(data=>{console.log(data);this.getProduct()})
  }

}
