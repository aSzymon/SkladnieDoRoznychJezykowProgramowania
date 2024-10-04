import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, RouterOutlet],
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'ngSwitch';

  name : string = "ngSwitch";

  jedzenie : any[] = [

    {nazwa : 'marchewka', cena : '2,45', warotsc : '1'},
    {nazwa : 'cytryna', cena : '8,34', warotsc : '2'},
    {nazwa : 'gruszka', cena : '5,76', warotsc : '2'},
    {nazwa : 'czekolada', cena : '4,55', warotsc : '3'},
    {nazwa : 'lizak', cena : '1,22', warotsc : '3'},
    {nazwa : 'cukierki', cena : '14,66', warotsc : '3'},
    {nazwa : 'pietruszka', cena : '9,22', warotsc : '1'},
    {nazwa : 'jabłko', cena : '3,11', warotsc : '2'},
    {nazwa : 'maliny', cena : '12,54', warotsc : '2'},
    {nazwa : 'por', cena : '3,87', warotsc : '1'},
    {nazwa : 'ziemniak', cena : '4,45', warotsc : '1'},
    {nazwa : 'żelki', cena : '5,50', warotsc : '3'},
    {nazwa : 'pomidor', cena : '3,20', warotsc : ''},
  
  ]
}
