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
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Service
public class TravelService {
    @Value("${insurance_server.url}")
    private String url;
    @Value("${insurance_server.login}")
    private String login;
    @Value("${insurance_server.password}")
    private String password;
    @Autowired
    private RestTemplate restTemplate;

    public TariffInfoResponseModel getTariffInfoResponse(String text) {
        HttpHeaders headers = makeHttpHeaders();
        HttpEntity<Object> entity = new HttpEntity<>(headers);
        ResponseEntity<TariffInfoResponseModel> responseEntity =
                restTemplate.exchange(url+text , HttpMethod.GET, entity, TariffInfoResponseModel.class);
        return responseEntity.getBody();
    }

    public ProgrammesTariffResponseModel getProgrammesOfTariff(String text, String id) {
        HttpHeaders headers = makeHttpHeaders();
        HttpEntity<Object> entity = new HttpEntity<>(headers);
        URI uri = UriComponentsBuilder
                .fromUri(URI.create(url + text))
                .queryParam("settingId", id)
                .build()
                .toUri();
        ResponseEntity<ProgrammesTariffResponseModel> responseEntity =
                restTemplate.exchange(uri, HttpMethod.GET, entity, ProgrammesTariffResponseModel.class);
        return responseEntity.getBody();
    }

    public TravelMultiTripResponseModel getMultiTariffFares(String text, String settingId, String programId) {
        HttpHeaders headers = makeHttpHeaders();
        HttpEntity<Object> entity = new HttpEntity<>(headers);
        URI uri = UriComponentsBuilder
                .fromUri(URI.create(url + text))
                .queryParam("settingId", settingId)
                .queryParam("programId", programId)
                .build()
                .toUri();
        ResponseEntity<TravelMultiTripResponseModel> responseEntity =
                restTemplate.exchange(uri, HttpMethod.GET, entity, TravelMultiTripResponseModel.class);
        return responseEntity.getBody();
    }

    public TargetTariffResponseModel getTargetTariffs(String text, String settingId) {
        HttpHeaders headers = makeHttpHeaders();
        HttpEntity<Object> entity = new HttpEntity<>(headers);
        URI uri = UriComponentsBuilder
                .fromUri(URI.create(url + text))
                .queryParam("settingId", settingId)
                .build()
                .toUri();
        ResponseEntity<TargetTariffResponseModel> responseEntity =
                restTemplate.exchange(uri, HttpMethod.GET, entity, TargetTariffResponseModel.class);
        return responseEntity.getBody();
    }

    public AgeTariffResponseModel travelAgeTariffResponseModel(String text, String settingId) {
        HttpHeaders headers = makeHttpHeaders();
        HttpEntity<Object> entity = new HttpEntity<>(headers);
        URI uri = UriComponentsBuilder
                .fromUri(URI.create(url + text))
                .queryParam("settingId", settingId)
                .build()
                .toUri();
        ResponseEntity<AgeTariffResponseModel> responseEntity =
                restTemplate.exchange(uri, HttpMethod.GET, entity, AgeTariffResponseModel.class);
        return responseEntity.getBody();
    }

    public FamilyTariffResponseModel getFamilyTariffResponseModel(String text, String settingId) {
        HttpHeaders headers = makeHttpHeaders();
        HttpEntity<Object> entity = new HttpEntity<>(headers);
        URI uri = UriComponentsBuilder
                .fromUri(URI.create(url + text))
                .queryParam("settingId", settingId)
                .build()
                .toUri();
        ResponseEntity<FamilyTariffResponseModel> responseEntity =
                restTemplate.exchange(uri, HttpMethod.GET, entity, FamilyTariffResponseModel.class);
        return responseEntity.getBody();
    }

    public GroupTariffResponseModel getGroupTariffResponseModel(String text, String settingId) {
        HttpHeaders headers = makeHttpHeaders();
        HttpEntity<Object> entity = new HttpEntity<>(headers);
        URI uri = UriComponentsBuilder
                .fromUri(URI.create(url + text))
                .queryParam("settingId", settingId)
                .build()
                .toUri();
        ResponseEntity<GroupTariffResponseModel> responseEntity =
                restTemplate.exchange(uri, HttpMethod.GET, entity, GroupTariffResponseModel.class);
        return responseEntity.getBody();
    }

    public Object createContractResponseModel(CreateAgreementRequestModel createAgreementRequestModel) {
        String u = url + "/travel/create";
        System.out.println(u);
        HttpHeaders headers = makeHttpHeaders();
        HttpEntity<CreateAgreementRequestModel> entity = new HttpEntity<>(createAgreementRequestModel, headers);
        ResponseEntity<Object> responseEntity;
        try {
            responseEntity = restTemplate.exchange(u, HttpMethod.POST, entity, Object.class);
            return responseEntity.getBody();
        } catch (HttpStatusCodeException e) {
            return ResponseEntity.status(e.getRawStatusCode()).headers(e.getResponseHeaders())
                    .body(e.getResponseBodyAsString());
        }
    }

    public Object paymentConfirmRequest(PaymentConfirmRequestModel paymentConfirmRequestModel) {
        String u = url + "/travel/payment/confirm";
        System.out.println(u);
        HttpHeaders headers = makeHttpHeaders();
        HttpEntity<PaymentConfirmRequestModel> entity = new HttpEntity<>(paymentConfirmRequestModel, headers);
        ResponseEntity<Object> responseEntity;
        try {
            responseEntity = restTemplate.exchange(u, HttpMethod.POST, entity, Object.class);
            return responseEntity.getBody();
        } catch (HttpStatusCodeException e) {
            return ResponseEntity.status(e.getRawStatusCode()).headers(e.getResponseHeaders())
                    .body(e.getResponseBodyAsString());
        }
    }
    public Object paymentCancelRequest(PaymentCancelRequestBody paymentCancelRequestBody){
        String u = url + "/travel/cancel";
        System.out.println(u);
        HttpHeaders headers = makeHttpHeaders();
        HttpEntity<PaymentCancelRequestBody> entity = new HttpEntity<>(paymentCancelRequestBody, headers);
        ResponseEntity<Object> responseEntity;
        try {
            responseEntity = restTemplate.exchange(u, HttpMethod.POST, entity, Object.class);
            return responseEntity.getBody();
        } catch (HttpStatusCodeException e) {
            return ResponseEntity.status(e.getRawStatusCode()).headers(e.getResponseHeaders())
                    .body(e.getResponseBodyAsString());
        }
    }
    public Object terminateAgreementRequest(TerminateAgreementRequestModel terminateAgreementRequestModel){
        String u = url + "/travel/terminate";
        System.out.println(u);
        HttpHeaders headers = makeHttpHeaders();
        HttpEntity<TerminateAgreementRequestModel> entity = new HttpEntity<>(terminateAgreementRequestModel, headers);
        ResponseEntity<Object> responseEntity;
        try {
            responseEntity = restTemplate.exchange(u, HttpMethod.POST, entity, Object.class);
            return responseEntity.getBody();
        } catch (HttpStatusCodeException e) {
            return ResponseEntity.status(e.getRawStatusCode()).headers(e.getResponseHeaders())
                    .body(e.getResponseBodyAsString());
        }
    }
    public CountriesResponseModel getCountriesResponseModel(){
        String u=url+"/references/countries";
        System.out.println(u);
        HttpHeaders headers = makeHttpHeaders();
        HttpEntity<Object> entity = new HttpEntity<>(headers);
        ResponseEntity<CountriesResponseModel> responseEntity =
                restTemplate.exchange(u , HttpMethod.GET, entity, CountriesResponseModel.class);
        return responseEntity.getBody();
    }
    public RegionsResponseModel getRegionsResponseModel(){
        String u=url+"/references/regions";
        System.out.println(u);
        HttpHeaders headers = makeHttpHeaders();
        HttpEntity<Object> entity = new HttpEntity<>(headers);
        ResponseEntity<RegionsResponseModel> responseEntity =
                restTemplate.exchange(u , HttpMethod.GET, entity, RegionsResponseModel.class);
        return responseEntity.getBody();
    }
    public DistrictResponseModel getDistrictResponseModel(String regionId,String regionEosgoUzId){
        String u=url+"/references/districts";
        System.out.println(u);
        HttpHeaders headers = makeHttpHeaders();
        HttpEntity<Object> entity = new HttpEntity<>(headers);
        URI uri = UriComponentsBuilder
                .fromUri(URI.create(u))
                .queryParam("regionId", regionId)
                .queryParam("regionEosgoUzId",regionEosgoUzId)
                .build()
                .toUri();
        ResponseEntity<DistrictResponseModel> responseEntity =
                restTemplate.exchange(uri , HttpMethod.GET, entity, DistrictResponseModel.class);
        return responseEntity.getBody();
    }
    public OwnershipResponseModel getOwnershipResponseModel(){
        String u=url+"/references/ownershipFormTypes";
        System.out.println(u);
        HttpHeaders headers = makeHttpHeaders();
        HttpEntity<Object> entity = new HttpEntity<>(headers);
        ResponseEntity<OwnershipResponseModel> responseEntity =
                restTemplate.exchange(u , HttpMethod.GET, entity, OwnershipResponseModel.class);
        return responseEntity.getBody();
    }
    private HttpHeaders makeHttpHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");
        headers.add("Authorization", makeAuthorization());
        headers.add("Accept", "application/json");
        return headers;
    }

    private String makeAuthorization() {
        return "Basic " + login + ":" + password;
    }
}
