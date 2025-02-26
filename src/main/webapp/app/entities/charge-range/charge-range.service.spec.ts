/* tslint:disable max-line-length */
import axios from 'axios';
import sinon from 'sinon';

import ChargeRangeService from './charge-range.service';
import { ChargeRange } from '@/shared/model/charge-range.model';

const error = {
  response: {
    status: null,
    data: {
      type: null,
    },
  },
};

const axiosStub = {
  get: sinon.stub(axios, 'get'),
  post: sinon.stub(axios, 'post'),
  put: sinon.stub(axios, 'put'),
  patch: sinon.stub(axios, 'patch'),
  delete: sinon.stub(axios, 'delete'),
};

describe('Service Tests', () => {
  describe('ChargeRange Service', () => {
    let service: ChargeRangeService;
    let elemDefault;

    beforeEach(() => {
      service = new ChargeRangeService();
      elemDefault = new ChargeRange(123, 'AAAAAAA', 'AAAAAAA', 0, 0, 0, 'AAAAAAA', 'AAAAAAA', 'AAAAAAA', 'AAAAAAA', 0, 0, 'AAAAAAA', 0);
    });

    describe('Service methods', () => {
      it('should find an element', async () => {
        const returnedFromService = { ...elemDefault };
        axiosStub.get.resolves({ data: returnedFromService });

        return service.find(123).then(res => {
          expect(res).toMatchObject(elemDefault);
        });
      });

      it('should not find an element', async () => {
        axiosStub.get.rejects(error);
        return service
          .find(123)
          .then()
          .catch(err => {
            expect(err).toMatchObject(error);
          });
      });

      it('should create a ChargeRange', async () => {
        const returnedFromService = { id: 123, ...elemDefault };
        const expected = { ...returnedFromService };

        axiosStub.post.resolves({ data: returnedFromService });
        return service.create({}).then(res => {
          expect(res).toMatchObject(expected);
        });
      });

      it('should not create a ChargeRange', async () => {
        axiosStub.post.rejects(error);

        return service
          .create({})
          .then()
          .catch(err => {
            expect(err).toMatchObject(error);
          });
      });

      it('should update a ChargeRange', async () => {
        const returnedFromService = {
          billerid: 'BBBBBB',
          processingcode: 'BBBBBB',
          max: 1,
          min: 1,
          amount: 1,
          createdby: 'BBBBBB',
          approvedby: 'BBBBBB',
          createdat: 'BBBBBB',
          approvedon: 'BBBBBB',
          approved: 1,
          declined: 1,
          declinedby: 'BBBBBB',
          chargeid: 1,
          ...elemDefault,
        };

        const expected = { ...returnedFromService };
        axiosStub.put.resolves({ data: returnedFromService });

        return service.update(expected).then(res => {
          expect(res).toMatchObject(expected);
        });
      });

      it('should not update a ChargeRange', async () => {
        axiosStub.put.rejects(error);

        return service
          .update({})
          .then()
          .catch(err => {
            expect(err).toMatchObject(error);
          });
      });

      it('should partial update a ChargeRange', async () => {
        const patchObject = { min: 1, amount: 1, approved: 1, declinedby: 'BBBBBB', ...new ChargeRange() };
        const returnedFromService = Object.assign(patchObject, elemDefault);

        const expected = { ...returnedFromService };
        axiosStub.patch.resolves({ data: returnedFromService });

        return service.partialUpdate(patchObject).then(res => {
          expect(res).toMatchObject(expected);
        });
      });

      it('should not partial update a ChargeRange', async () => {
        axiosStub.patch.rejects(error);

        return service
          .partialUpdate({})
          .then()
          .catch(err => {
            expect(err).toMatchObject(error);
          });
      });

      it('should return a list of ChargeRange', async () => {
        const returnedFromService = {
          billerid: 'BBBBBB',
          processingcode: 'BBBBBB',
          max: 1,
          min: 1,
          amount: 1,
          createdby: 'BBBBBB',
          approvedby: 'BBBBBB',
          createdat: 'BBBBBB',
          approvedon: 'BBBBBB',
          approved: 1,
          declined: 1,
          declinedby: 'BBBBBB',
          chargeid: 1,
          ...elemDefault,
        };
        const expected = { ...returnedFromService };
        axiosStub.get.resolves([returnedFromService]);
        return service.retrieve().then(res => {
          expect(res).toContainEqual(expected);
        });
      });

      it('should not return a list of ChargeRange', async () => {
        axiosStub.get.rejects(error);

        return service
          .retrieve()
          .then()
          .catch(err => {
            expect(err).toMatchObject(error);
          });
      });

      it('should delete a ChargeRange', async () => {
        axiosStub.delete.resolves({ ok: true });
        return service.delete(123).then(res => {
          expect(res.ok).toBeTruthy();
        });
      });

      it('should not delete a ChargeRange', async () => {
        axiosStub.delete.rejects(error);

        return service
          .delete(123)
          .then()
          .catch(err => {
            expect(err).toMatchObject(error);
          });
      });
    });
  });
});
