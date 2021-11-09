import {Injectable} from '@angular/core';
import {Observable} from "rxjs";
import {HttpClient} from "@angular/common/http";
import {Test} from "./Test";

@Injectable({
  providedIn: 'root'
})
export class TestService {

  constructor(private httpClient: HttpClient) {
  }

  getTestData(): Observable<Test> {
    return this.httpClient.get<Test>("http://localhost:8081");
  }
}
