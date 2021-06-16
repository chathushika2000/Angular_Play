/* tslint:disable:no-unused-variable */
import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { By } from '@angular/platform-browser';
import { DebugElement } from '@angular/core';

import { MatchplayedComponent } from './Matchplayed.component';

describe('MatchplayedComponent', () => {
  let component: MatchplayedComponent;
  let fixture: ComponentFixture<MatchplayedComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MatchplayedComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MatchplayedComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
