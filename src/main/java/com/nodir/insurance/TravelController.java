package com.nodir.insurance;

import com.nodir.insurance.age_tariff.AgeTariffResponseModel;
import com.nodir.insurance.contract.CreateAgreementRequestModel;
import com.nodir.insurance.countries.CountriesResponseModel;
import com.nodir.insurance.districts.DistrictResponseModel;
import com.nodir.insurance.family_tariff.FamilyTariffResponseModel;
import com.nodir.insurance.group_tariff.GroupTariffResponseModel;
import com.nodir.insurance.ownership.OwnershipResponseModel;
import com.nodir.insurance.payment_cancel.PaymentCancelRequestBody;
import com.nodir.insurance.payment_confirm.PaymentConfirmRequestModel;
import com.nodir.insurance.regions.RegionsResponseModel;
import com.nodir.insurance.target_tariff.TargetTariffResponseModel;
import com.nodir.insurance.tariff_info.TariffInfoResponseModel;
import com.nodir.insurance.tariff_program.ProgrammesTariffResponseModel;
import com.nodir.insurance.terminate_agreement.TerminateAgreementRequestModel;
import com.nodir.insurance.trip_fare.TravelMultiTripResponseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class TravelController {
    @Autowired
    private TravelService travelService;

    @GetMapping("/travel/settings")
    public TariffInfoResponseModel getTariffResponseInfo() {
        return travelService.getTariffInfoResponse("/travel/settings");
    }

    @GetMapping("/programmes/tariff")
    public ProgrammesTariffResponseModel getProgrammesTariff(@RequestParam String id) {
        return travelService.getProgrammesOfTariff("/travel/settings/programs", id);
    }

    @GetMapping("/multiple-trip/fares")
    public TravelMultiTripResponseModel getMultipleTripResponseModel(@RequestParam String settingId,
                                                                     @RequestParam String programId) {
        return travelService.getMultiTariffFares("/travel/settings/multiTrips", settingId, programId);
    }
    @GetMapping("/single-trip/fares")
    public TravelMultiTripResponseModel getSingleTripResponseModel(@RequestParam String settingId,
                                                                     @RequestParam String programId) {
        return travelService.getMultiTariffFares("/travel/settings/singleTrips", settingId, programId);
    }
    @GetMapping("/target/tariffs")
    public TargetTariffResponseModel getTargetTariffOperationResultModel(@RequestParam String settingId) {
        return travelService.getTargetTariffs("/travel/tariffs/target", settingId);
    }

    @GetMapping("/tariff/age")
    public AgeTariffResponseModel travelAgeTariffResponseModel(@RequestParam String settingId) {
        return travelService.travelAgeTariffResponseModel("/travel/tariffs/age", settingId);
    }

    @GetMapping("/tariff/family")
    public FamilyTariffResponseModel getFamilyTariffResponseModel(@RequestParam String settingId) {
        return travelService.getFamilyTariffResponseModel("/travel/tariffs/family", settingId);
    }

    @GetMapping("/tariff/group")
    public GroupTariffResponseModel getGroupTariffResponseModel(@RequestParam String settingId) {
        return travelService.getGroupTariffResponseModel("/travel/tariffs/group", settingId);
    }

    @PostMapping("/contract/create")
    public Object createContractResponseModel(@RequestBody CreateAgreementRequestModel createAgreementRequestModel) {
        return travelService.createContractResponseModel(createAgreementRequestModel);
    }

    @PostMapping("/payment/confirm")
    public Object paymentConfirmPostMethod(@RequestBody PaymentConfirmRequestModel paymentConfirmRequestModel) {
        return travelService.paymentConfirmRequest(paymentConfirmRequestModel);
    }

    @PostMapping("/payment/cancel")
    public Object paymentCancelPostMethod(@RequestBody PaymentCancelRequestBody paymentCancelRequestBody) {
        return travelService.paymentCancelRequest(paymentCancelRequestBody);
    }

    @PostMapping("/terminate/agreement")
    public Object terminateAgreementPostMethod(@RequestBody TerminateAgreementRequestModel terminateAgreementRequestModel) {
        return travelService.terminateAgreementRequest(terminateAgreementRequestModel);
    }

    @GetMapping("/references/countries")
    public CountriesResponseModel getCountriesResponseModel() {
        return travelService.getCountriesResponseModel();
    }

    @GetMapping("/references/regions")
    public RegionsResponseModel getRegionsResponseModel() {
        return travelService.getRegionsResponseModel();
    }

    @GetMapping("/references/districts")
    public DistrictResponseModel getDistrictResponseModel(@RequestParam String regionId,
                                                          @RequestParam String regionEosgoUzId) {
       return travelService.getDistrictResponseModel(regionId,regionEosgoUzId);
    }
    @GetMapping("/references/ownershipFormTypes")
    public OwnershipResponseModel getOwnershipResponseModel(){
        return travelService.getOwnershipResponseModel();
    }
}
