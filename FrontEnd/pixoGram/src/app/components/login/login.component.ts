import {Component, OnInit} from '@angular/core';
import {FormGroup, FormBuilder, Validators} from '@angular/forms';
import {UserModel} from 'src/app/models/user.model';
import {Router} from '@angular/router';
import {UserService} from 'src/app/services/user.service';
import {LoginModel} from 'src/app/models/login.model';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private fb: FormBuilder, private router: Router, private userService: UserService) {

    this.loginForm = fb.group({
      userName1: ['', [Validators.required, Validators.minLength(3)]],
      password: ['', [Validators.required, Validators.minLength(8), Validators.maxLength(120)]],

    });
  }

  loginForm: FormGroup;
  userName1 = '';
  password = '';
  post: any;
  invalidLogin = false;
  users: UserModel[];
  loginuser: LoginModel;

  ngOnInit(): void {
    const authval = sessionStorage.getItem('auth');
    // tslint:disable-next-line:triple-equals
    if (authval == 'true') {
      this.router.navigate(['/follow']);
    }

  }

  onlogin(data) {

    console.log(data.userName1);


    this.userService.getLoginByName(data.userName1).subscribe((login) => {
        console.log(login);
        this.loginuser = JSON.parse(JSON.stringify(login));
        console.log(this.loginuser);

        // tslint:disable-next-line:triple-equals
        if (this.loginuser.password == data.password) {
          console.log('login successfull');

          sessionStorage.setItem('auth', 'true');
          sessionStorage.setItem('userpic', this.loginuser.profilepic);
          sessionStorage.setItem('userid', this.loginuser.id);
          sessionStorage.setItem('username', this.loginuser.username);
          window.location.reload();
          this.router.navigate(['/follow']);
        }

      },
      error => console.log(error), () => {
        console.log('completed');
      }
    );

  }


}
