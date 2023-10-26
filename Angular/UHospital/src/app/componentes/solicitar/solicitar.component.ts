import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-solicitar',
  templateUrl: './solicitar.component.html',
  styleUrls: ['./solicitar.component.css']
})
export class SolicitarComponent {
  @Input() dato: any;
  
  ngOnInit(): void {

    
  }  
}
