import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Category } from 'src/app/Category';
import { CategoryServiceService } from 'src/app/Service/category-service.service';

@Component({
  selector: 'app-get-all-category',
  templateUrl: './get-all-category.component.html',
  styleUrls: ['./get-all-category.component.css']
})
export class GetAllCategoryComponent {

  category!:Category[];

  constructor(private categoryService:CategoryServiceService,private router:Router,private route : ActivatedRoute)
  {

  }
  ngOnInit(): void {
   this.getCategory();
  }
  private getCategory(){
    this.categoryService.getAll().subscribe(data =>
      {
        this.category=data;
      }, error => console.log(error))
  }


  CategoryDetails(categoryId:number)
  {
    this.router.navigate(['/categories',categoryId]);
  }
  updateCategory(categoryId:number)
  {
    this.router.navigate(['/categories',categoryId]);
  }
  deleteCategory(categoryId:number)
  {
    this.categoryService.deleteCategory(categoryId).subscribe(data=>{console.log(data);this.getCategory()})
  }
}
