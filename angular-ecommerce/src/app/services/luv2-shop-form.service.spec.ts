import { TestBed } from '@angular/core/testing';
import { HttpClientTestingModule } from '@angular/common/http/testing';
import { Luv2ShopFormService } from './luv2-shop-form.service';

describe('Luv2ShopFormService', () => {
  let service: Luv2ShopFormService;

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [HttpClientTestingModule],
      providers: [Luv2ShopFormService]});
    //service = TestBed.inject(Luv2ShopFormService);
  });

  it('should be created', () => {
    service = TestBed.get(Luv2ShopFormService);
    expect(service).toBeTruthy();
  });
});
