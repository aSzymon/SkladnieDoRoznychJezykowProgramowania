/** aSzymon - gtihub */

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
  title = 'ngFor';

  name : string = 'ngFor';

  listaZwierzat = ['pies','kot','szczur','chomik']

  imiona = ['Szymon','Przemek','Robert','Maciej','Kacper']
}
