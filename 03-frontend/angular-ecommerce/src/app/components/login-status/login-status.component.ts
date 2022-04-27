import { identifierName } from '@angular/compiler';
import { Component, OnInit } from '@angular/core';
import { OktaAuthService } from '@okta/okta-angular';

@Component({
  selector: 'app-login-status',
  templateUrl: './login-status.component.html',
  styleUrls: ['./login-status.component.css']
})
export class LoginStatusComponent implements OnInit {

  isAuthenticated: boolean = false;
  userFullName: string;

  storage: Storage = sessionStorage;

  constructor(private oktaAuthService: OktaAuthService) { }

  ngOnInit(): void {
    //subscribe to authentication state changes
    this.oktaAuthService.$authenticationState.subscribe(
      (result) => {
        this.isAuthenticated = result;
        this.getUserDetails();
      }
    );

  }

  getUserDetails(){
    if(this.isAuthenticated){
      //fetched the logged in user details (user's claims
      
      //user full name is exposed as a property name
      this.oktaAuthService.getUser().then(
        (res) => {
          this.userFullName = res.name;

          //retrieve the users email from auth response
          const theEmail = res.email;

          //now store email in browser storage
          this.storage.setItem('userEmail', JSON.stringify(theEmail));
        }
      );
    }
  }

  logout(){
    //terminates session with Okta and removes current tokens
    this.oktaAuthService.signOut();
  }
}
