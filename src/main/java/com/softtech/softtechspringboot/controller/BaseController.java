package com.softtech.softtechspringboot.controller;

import com.softtech.softtechspringboot.dto.*;
import com.softtech.softtechspringboot.entity.*;
import com.softtech.softtechspringboot.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Properties;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/address")
public class BaseController {
    private final CountryService countryService;
    private final CityService cityService;
    private final DistrictService districtService;
    private final NeighborhoodService neighborhoodService;
    private final StreetService streetService;
    private final AddressService addressService;


//Ülkeyi post etmek için kullanılıyor.
    @PostMapping("/country")
    public Country save(@RequestBody Country country) {

        return countryService.save(country);
    }
    
//Ülke verilerini almak için kullanılıyor.
    @GetMapping("/country")
    public ResponseEntity findCountryById(@RequestParam int countryId) {
        CountryDto countryDto = countryService.findById(countryId);
        return ResponseEntity.ok(countryDto);
    }

//Şehri post etmek için kullanılıyor.
    @PostMapping("/city")
    public  City save(@RequestBody City city){

        return cityService.save(city);
    }

//Şehir verilerini almak için kullanılıyor.
    @GetMapping("/city")
    public ResponseEntity getCityById(@RequestParam String id){

        CityDto cityDto = cityService.findById(id);

        return ResponseEntity.ok(cityDto);
    }
//İlçeyi post etmek için kullanılıyor.
    @PostMapping("/district")
    public District save(@RequestBody District district) {

        return districtService.save(district);
    }

//İlçe verilerini almak için kullanılıyor.
    @GetMapping("/district")
    public  ResponseEntity getDistrictByID(@RequestParam int id){

        DistrictDto districtDto= districtService.findById(id);

        return  ResponseEntity.ok(districtDto);
    }
///Mahalleyi post etmek için kullanılıyor.
    @PostMapping("/neighborhood")
    public Neighborhood save(@RequestBody Neighborhood neighborhood) {

        return neighborhoodService.save(neighborhood);
    }

//Mahalle verilerini almak için kullanılıyor.
    @GetMapping("/neighborhood")
    public  ResponseEntity getNeighborhoodById(@RequestParam int id){

        NeighborhoodDto neighborhoodDto=neighborhoodService.findById(id);

        return ResponseEntity.ok(neighborhoodDto);
    }

   /* @PutMapping("/neighborhood")
    public ResponseEntity update(@RequestBody NeighborhoodUpdateDto neighborhoodUpdateDto){

        NeighborhoodDto neighborhoodDto=neighborhoodService.update(neighborhoodUpdateDto);

        return ResponseEntity.ok(neighborhoodDto);

    }*/
//Sokağı post etmek için kullanılıyor.
    @PostMapping("/street")
    public Street save(@RequestBody Street street) {

        return streetService.save(street);
    }

//Sokak verilerini almak için kullanılıyor.
    @GetMapping("/street")
    public ResponseEntity findStreetById(@RequestParam int streetId){
        StreetDto streetDto=streetService.findById(streetId);
        return ResponseEntity.ok(streetDto);
    }
    ////Adresi post etmek için kullanılıyor.
    @PostMapping("/fullAddress")
    public Address save(@RequestBody Address address){


        return addressService.save(address);
    }
//Adres verilerini almak için kullanılıyor.
    @GetMapping("/fullAddress")
    public ResponseEntity findFullAddressById(@RequestParam int fullAddressId){

        AddressDto addressDto=addressService.findById(fullAddressId);
        return  ResponseEntity.ok(addressDto);
    }
    //Adresi silmek için kullanılır.
   @DeleteMapping("/{id}")
   public ResponseEntity delete(@PathVariable int id){

       addressService.delete(id);

       return ResponseEntity.ok(Void.TYPE);
   }


    }





