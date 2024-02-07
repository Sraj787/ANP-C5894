import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Category } from 'src/app/Category';
import { CategoryServiceService } from 'src/app/Service/category-service.service';

@Component({
  selector: 'app-add-category',
  templateUrl: './add-category.component.html',
  styleUrls: ['./add-category.component.css']
})
export class AddCategoryComponent {
  category: Category =new Category();

  constructor(private categoryService : CategoryServiceService, private router:Router){
  }
  ngOnInit(): void {}
  
  saveCategory(){
    this.categoryService.AddCategory(this.category).subscribe(data=>{
      console.log(data);
      this.gotoCategoryList();
    },
    error => console.log(error));
}
  gotoCategoryList(){
    this.router.navigate(['/categories'])
  }

  onSubmit(){
    console.log(this.category);
    this.saveCategory();
  }
}
