import {Component, OnInit} from '@angular/core';
import {Observable} from "rxjs";
import {TestService} from "./test.service";
import {Test} from "./Test";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'frontend';
  test: Test = new Test();


  constructor(private testService: TestService) {
    this.testData();
  }


  ngOnInit(): void {
    this.testData();
  }

  testData() {
    this.testService.getTestData()
      .subscribe(response => {
        this.test = response
        this.title = this.test.message;
      })
  }
}
