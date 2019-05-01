import { TestBed } from '@angular/core/testing';

import { Lab4serviceService } from './lab4service.service';

describe('Lab4serviceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: Lab4serviceService = TestBed.get(Lab4serviceService);
    expect(service).toBeTruthy();
  });
});
