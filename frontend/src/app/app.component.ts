import {Component, OnInit} from '@angular/core';
import {Observable} from "rxjs";
import {TestService} from "./test.service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'frontend';


  constructor(private testService: TestService) {
    this.testData();
  }



  ngOnInit(): void {
    this.testData();
  }

  testData() {
    this.testService.getTestData().subscribe(stringData => {
      this.title = stringData;
      console.log(this.title)
      console.log(stringData)
    })
  }
}
