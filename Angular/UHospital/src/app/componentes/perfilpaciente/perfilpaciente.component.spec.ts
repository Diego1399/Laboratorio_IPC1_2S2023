import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PerfilpacienteComponent } from './perfilpaciente.component';

describe('PerfilpacienteComponent', () => {
  let component: PerfilpacienteComponent;
  let fixture: ComponentFixture<PerfilpacienteComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [PerfilpacienteComponent]
    });
    fixture = TestBed.createComponent(PerfilpacienteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
