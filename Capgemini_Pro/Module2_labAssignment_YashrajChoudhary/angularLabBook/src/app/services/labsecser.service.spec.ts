import { TestBed } from '@angular/core/testing';

import { LabsecserService } from './labsecser.service';

describe('LabsecserService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: LabsecserService = TestBed.get(LabsecserService);
    expect(service).toBeTruthy();
  });
});
