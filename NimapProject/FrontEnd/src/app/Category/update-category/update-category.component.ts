import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Category } from 'src/app/Category';
import { CategoryServiceService } from 'src/app/Service/category-service.service';

@Component({
  selector: 'app-update-category',
  templateUrl: './update-category.component.html',
  styleUrls: ['./update-category.component.css']
})
export class UpdateCategoryComponent {
  categoryId!: number;
  //creating the object of the Employee
  category: Category = new Category();
  

  //creating constructor
  constructor(private categoryService:CategoryServiceService,
    private router:Router,
    private route : ActivatedRoute){}
  
  ngOnInit(): void {
    
    this.categoryId = this.route.snapshot.params['categoryId'];

    this.categoryService.getCategoryById(this.categoryId).subscribe(data => {
      this.category = data;
    }, error => console.log(error));
    } 

  
  updateCategory(){
    this.categoryService.updateCategory(this.categoryId, this.category).subscribe(data=>
    {
      this.gotoCategoryList();
    },error => console.log(error));
  }
 
  onSubmit(){
    this.updateCategory();
  }

  gotoCategoryList(){
    this.router.navigate(['/categories'])
  }
}
