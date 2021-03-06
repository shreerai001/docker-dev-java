import {Component, OnInit} from '@angular/core';
import {TestService} from "../test.service";
import {Observable} from "rxjs";
import {Test} from "../Test";

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {

  constructor(private testService: TestService) {
  }

  ngOnInit(): void {
  }

  testData(): Observable<Test> {
    return this.testService.getTestData();
  }

}
