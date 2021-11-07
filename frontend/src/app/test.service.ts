import {Injectable} from '@angular/core';
import {Observable} from "rxjs";
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class TestService {

  constructor(private httpClient: HttpClient) {
  }

  getTestData(): Observable<string> {
    return this.httpClient.get<string>("http://localhost:8081");
  }
}
