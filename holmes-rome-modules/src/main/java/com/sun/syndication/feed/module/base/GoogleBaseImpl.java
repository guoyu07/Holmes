/*
 * GoogleBaseImpl.java
 *
 * Created on November 16, 2005, 2:06 PM
 *
 * This library is provided under dual licenses.
 * You may choose the terms of the Lesser General Public License or the Apache
 * License at your discretion.
 *
 *  Copyright (C) 2005  Robert Cooper, Temple of the Screaming Penguin
 *
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.sun.syndication.feed.module.base;

import java.lang.reflect.Array;
import java.net.URL;
import java.util.Date;

import com.sun.syndication.feed.impl.EqualsBean;
import com.sun.syndication.feed.module.base.types.CloneableType;
import com.sun.syndication.feed.module.base.types.CurrencyEnumeration;
import com.sun.syndication.feed.module.base.types.DateTimeRange;
import com.sun.syndication.feed.module.base.types.FloatUnit;
import com.sun.syndication.feed.module.base.types.GenderEnumeration;
import com.sun.syndication.feed.module.base.types.IntUnit;
import com.sun.syndication.feed.module.base.types.PaymentTypeEnumeration;
import com.sun.syndication.feed.module.base.types.PriceTypeEnumeration;
import com.sun.syndication.feed.module.base.types.ShippingType;
import com.sun.syndication.feed.module.base.types.ShortDate;
import com.sun.syndication.feed.module.base.types.Size;
import com.sun.syndication.feed.module.base.types.YearType;

/**
 * This is the implementation class for the GoogleBase module interface.
 *
 * @author <a href="mailto:cooper@screaming-penguin.com">Robert "kebernet"
 *         Cooper</a>
 * @version $Revision: 1.2 $
 */
public class GoogleBaseImpl implements GoogleBase {
    private static final long serialVersionUID = -1471895363111086985L;

    /** boolean:listing_type */
    private Boolean listingType;

    /** Can this item be picked up. */
    private Boolean pickup;

    /** currencyCodeEnumeration:currency */
    private CurrencyEnumeration currency;

    /** dateTime:expiration_date_time */
    private Date expirationDateTime;

    /** dateTimeRange:course_date_range */
    private DateTimeRange courseDateRange;

    /** dateTimeRange:event_date_range */
    private DateTimeRange eventDateRange;

    /** dateTimeRange:travel_date_range */
    private DateTimeRange travelDateRange;

    /** float:bathrooms */
    private Float bathrooms;

    /** float:hoa_dues */
    private Float hoaDues;

    /** string:rating thoug this a value from 1 to 5 */
    private Float rating;

    /** float:salary */
    private Float salary;

    /** percentType:tax_percent */
    private Float taxPercent;

    /** floatUnit:delivery_radius */
    private FloatUnit deliveryRadius;

    /** floatUnit:megapixels */
    private FloatUnit megapixels;

    /** floatUnit:memory */
    private FloatUnit memory;

    /** floatUnit:price */
    private FloatUnit price;

    /** floatUnit:processor_speed */
    private FloatUnit processorSpeed;

    /** floatUnit:weight */
    private FloatUnit weight;

    /** genderEnumeration:gender */
    private GenderEnumeration gender;

    /** intUnit:area */
    private IntUnit area;

    /** integer:age */
    private Integer age;

    /** integer:bedrooms */
    private Integer bedrooms;

    /** integer:mileage */
    private Integer mileage;

    /** integer:pages */
    private Integer pages;

    /** integer:quantity */
    private Integer quantity;

    /** locationType:from_location */
    private String fromLocation;

    /** locationType:location */
    private String location;

    /** locationType:to_location */
    private String toLocation;

    /** priceTypeEnumeration:price_type */
    private PriceTypeEnumeration priceType;

    /** starting/neg:salary_type */
    private PriceTypeEnumeration salaryType;

    /** date:expiration_date */
    private ShortDate expirationDate;

    /** date:publishedDate */
    private ShortDate publishDate;

    /** string:size */
    private Size size;

    /** string:sexual_orientation */
    private String SexualOrientation;

    /** string apparel_type */
    private String apparelType;

    /** string:brand */
    private String brand;

    /** string:condition */
    private String condition;

    /** string:course_number */
    private String courseNumber;

    /** string:course_times */
    private String courseTimes;

    /** string:delivery_notes */
    private String deliveryNotes;

    /** string:education */
    private String education;

    /** string:employer */
    private String employer;

    /** string:id */
    private String id;

    /** string:immigration_status */
    private String immigrationStatus;

    /** stirng:isbn */
    private String isbn;

    /** string:make */
    private String make;

    /** string:manufacturer */
    private String manufacturer;

    /** string:manufacturer_id */
    private String manufacturerId;

    /** string:marital_status */
    private String maritalStatus;

    /** string:model */
    private String model;

    /** string:model_number */
    private String modelNumber;

    /** string:name_of_item_being_reviewed */
    private String nameOfItemBeingReviewed;

    /** string:news_source */
    private String newsSource;

    /** string:occupation */
    private String occupation;

    /** string:operating_systems */
    private String operatingSystems;

    /** string:payment_notes */
    private String paymentNotes;

    /** string:publication_name */
    private String publicationName;

    /** string:publication_volume */
    private String publicationVolume;

    /** string:review_type */
    private String reviewType;

    /** string:reviewer_type */
    private String reviewerType;

    /** string:school_district */
    private String schoolDistrict;

    /** string:service_type */
    private String serviceType;

    /** string:taxRegion */
    private String taxRegion;

    /** string:university */
    private String university;

    /** string:upc */
    private String upc;

    /** string:vehicle_type */
    private String vehicleType;

    /** string:vin */
    private String vin;

    /** string:url_of_item_being_reviewed */
    private URL urlOfItemBeingReviewed;

    /** string:year */
    private YearType year;

    /** string:actor */
    private String[] actors;

    /** string:agent */
    private String[] agents;

    /** string:artist */
    private String[] artists;

    /** string:author */
    private String[] authors;

    /** string:color */
    private String[] color;

    /** string:ethnicities */
    private String[] ethnicities;

    /** string:format */
    private String[] format;

    /** url:image_links */
    private URL[] imageLinks;

    /** string:interested_in */
    private String[] interestedIn;

    /** string:job_function */
    private String[] jobFunctions;

    /** string:job_industry */
    private String[] jobIndustries;

    /** string:job_type */
    private String[] jobTypes;

    /** string:label */
    private String[] labels;

    /** string:license */
    private String[] licenses;

    /** paymentTypeEnumeration:payment_accepted */
    private PaymentTypeEnumeration[] paymentAccepted;

    /** string:product_type */
    private String[] productTypes;

    /** string:programming_language */
    private String[] programmingLanguages;

    /** string:property_type */
    private String[] propertyTypes;

    /** url:related_link */
    private URL[] relatedLinks;

    /** shippingType:shipping */
    private ShippingType[] shipping;

    /** intUnitType:square_footage */
    private IntUnit[] squareFootages;

    /** string:subject_area */
    private String[] subjectAreas;

    /** string:subject */
    private String[] subjects;

    /**
     * DOCUMENT ME!
     *
     * @param actors
     */
    @Override
    public void setActors(String[] actors) {
        this.actors = actors;
    }

    @Override
    public String[] getActors() {
        return actors == null ? new String[0] : actors;
    }

    @Override
    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public Integer getAge() {
        return age;
    }

    @Override
    public void setAgents(String[] agents) {
        this.agents = agents == null ? new String[0] : agents;
    }

    @Override
    public String[] getAgents() {
        return agents;
    }

    @Override
    public void setApparelType(String apparelType) {
        this.apparelType = apparelType;
    }

    @Override
    public String getApparelType() {
        return apparelType;
    }

    @Override
    public void setArea(IntUnit area) {
        this.area = area;
    }

    @Override
    public IntUnit getArea() {
        return area;
    }

    @Override
    public void setArtists(String[] artists) {
        this.artists = artists;
    }

    @Override
    public String[] getArtists() {
        return artists == null ? new String[0] : artists;
    }

    @Override
    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    @Override
    public String[] getAuthors() {
        return authors == null ? new String[0] : authors;
    }

    @Override
    public void setBathrooms(Float bathrooms) {
        this.bathrooms = bathrooms;
    }

    @Override
    public Float getBathrooms() {
        return bathrooms;
    }

    @Override
    public void setBedrooms(Integer bedrooms) {
        this.bedrooms = bedrooms;
    }

    @Override
    public Integer getBedrooms() {
        return bedrooms;
    }

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public void setColors(String[] color) {
        this.color = color;
    }

    @Override
    public String[] getColors() {
        return color == null ? new String[0] : color;
    }

    @Override
    public void setCondition(String condition) {
        this.condition = condition;
    }

    @Override
    public String getCondition() {
        return condition;
    }

    @Override
    public void setCourseDateRange(DateTimeRange courseDateRange) {
        this.courseDateRange = courseDateRange;
    }

    @Override
    public DateTimeRange getCourseDateRange() {
        return courseDateRange;
    }

    @Override
    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    @Override
    public String getCourseNumber() {
        return courseNumber;
    }

    @Override
    public void setCourseTimes(String courseTimes) {
        this.courseTimes = courseTimes;
    }

    @Override
    public String getCourseTimes() {
        return courseTimes;
    }

    @Override
    public void setCurrency(CurrencyEnumeration currency) {
        this.currency = currency;
    }

    @Override
    public CurrencyEnumeration getCurrency() {
        return currency;
    }

    @Override
    public void setDeliveryNotes(String deliveryNotes) {
        this.deliveryNotes = deliveryNotes;
    }

    @Override
    public String getDeliveryNotes() {
        return deliveryNotes;
    }

    @Override
    public void setDeliveryRadius(FloatUnit deliveryRadius) {
        this.deliveryRadius = deliveryRadius;
    }

    @Override
    public FloatUnit getDeliveryRadius() {
        return deliveryRadius;
    }

    @Override
    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String getEducation() {
        return education;
    }

    @Override
    public void setEmployer(String employer) {
        this.employer = employer;
    }

    @Override
    public String getEmployer() {
        return employer;
    }

    @Override
    public void setEthnicities(String[] ethnicities) {
        this.ethnicities = ethnicities;
    }

    @Override
    public String[] getEthnicities() {
        return ethnicities == null ? new String[0] : ethnicities;
    }

    @Override
    public void setEventDateRange(DateTimeRange eventDateRange) {
        this.eventDateRange = eventDateRange;
    }

    @Override
    public DateTimeRange getEventDateRange() {
        return eventDateRange;
    }

    @Override
    public void setExpirationDate(Date expirationDate) {
        if ((expirationDate != null) && !(expirationDate instanceof ShortDate)) {
            this.expirationDate = new ShortDate(expirationDate);
        } else {
            this.expirationDate = null;
        }
    }

    @Override
    public Date getExpirationDate() {
        return expirationDate;
    }

    @Override
    public void setExpirationDateTime(Date expirationDateTime) {
        this.expirationDateTime = expirationDateTime;
    }

    @Override
    public Date getExpirationDateTime() {
        return expirationDateTime;
    }

    @Override
    public void setFormat(String[] format) {
        this.format = format;
    }

    @Override
    public String[] getFormat() {
        return format == null ? new String[0] : format;
    }

    @Override
    public void setFromLocation(String fromLocation) {
        this.fromLocation = fromLocation;
    }

    @Override
    public String getFromLocation() {
        return fromLocation;
    }

    @Override
    public void setGender(GenderEnumeration gender) {
        this.gender = gender;
    }

    @Override
    public GenderEnumeration getGender() {
        return gender;
    }

    @Override
    public void setHoaDues(Float hoaDues) {
        this.hoaDues = hoaDues;
    }

    @Override
    public Float getHoaDues() {
        return hoaDues;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setImageLinks(URL[] imageLinks) {
        this.imageLinks = imageLinks;
    }

    @Override
    public URL[] getImageLinks() {
        return imageLinks == null ? new URL[0] : imageLinks;
    }

    @Override
    public void setImmigrationStatus(String immigrationStatus) {
        this.immigrationStatus = immigrationStatus;
    }

    @Override
    public String getImmigrationStatus() {
        return immigrationStatus;
    }

    @Override
    public void setInterestedIn(String[] interestedIn) {
        this.interestedIn = interestedIn;
    }

    @Override
    public String[] getInterestedIn() {
        return interestedIn == null ? new String[0] : interestedIn;
    }

    @Override
    public Class<?> getInterface() {
        return GoogleBase.class;
    }

    @Override
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String getIsbn() {
        return isbn;
    }

    @Override
    public void setJobFunctions(String[] jobFunctions) {
        this.jobFunctions = jobFunctions;
    }

    @Override
    public String[] getJobFunctions() {
        return jobFunctions == null ? new String[0] : jobFunctions;
    }

    @Override
    public void setJobIndustries(String[] jobIndustries) {
        this.jobIndustries = jobIndustries;
    }

    @Override
    public String[] getJobIndustries() {
        return jobIndustries == null ? new String[0] : jobIndustries;
    }

    @Override
    public void setJobTypes(String[] jobTypes) {
        this.jobTypes = jobTypes;
    }

    @Override
    public String[] getJobTypes() {
        return jobTypes == null ? new String[0] : jobTypes;
    }

    @Override
    public void setLabels(String[] labels) {
        this.labels = labels;
    }

    @Override
    public String[] getLabels() {
        return labels == null ? new String[0] : labels;
    }

    @Override
    public void setLicenses(String[] licenses) {
        this.licenses = licenses;
    }

    @Override
    public String[] getLicenses() {
        return licenses == null ? new String[0] : licenses;
    }

    @Override
    public void setListingType(Boolean listingType) {
        this.listingType = listingType;
    }

    @Override
    public Boolean getListingType() {
        return listingType;
    }

    @Override
    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public void setManufacturerId(String manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    @Override
    public String getManufacturerId() {
        return manufacturerId;
    }

    @Override
    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    @Override
    public String getMaritalStatus() {
        return maritalStatus;
    }

    @Override
    public void setMegapixels(FloatUnit megapixels) {
        this.megapixels = megapixels;
    }

    @Override
    public FloatUnit getMegapixels() {
        return megapixels;
    }

    @Override
    public void setMemory(FloatUnit memory) {
        this.memory = memory;
    }

    @Override
    public FloatUnit getMemory() {
        return memory;
    }

    @Override
    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    @Override
    public Integer getMileage() {
        return mileage;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    @Override
    public String getModelNumber() {
        return modelNumber;
    }

    @Override
    public void setNameOfItemBeingReviewed(String nameOfItemBeingReviewed) {
        this.nameOfItemBeingReviewed = nameOfItemBeingReviewed;
    }

    @Override
    public String getNameOfItemBeingReviewed() {
        return nameOfItemBeingReviewed;
    }

    @Override
    public void setNewsSource(String newsSource) {
        this.newsSource = newsSource;
    }

    @Override
    public String getNewsSource() {
        return newsSource;
    }

    @Override
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Override
    public String getOccupation() {
        return occupation;
    }

    @Override
    public void setOperatingSystems(String operatingSystems) {
        this.operatingSystems = operatingSystems;
    }

    @Override
    public String getOperatingSystems() {
        return operatingSystems;
    }

    @Override
    public void setPages(Integer pages) {
        this.pages = pages;
    }

    @Override
    public Integer getPages() {
        return pages;
    }

    @Override
    public void setPaymentAccepted(PaymentTypeEnumeration[] paymentAccepted) {
        this.paymentAccepted = paymentAccepted;
    }

    @Override
    public PaymentTypeEnumeration[] getPaymentAccepted() {
        return paymentAccepted == null ? new PaymentTypeEnumeration[0] : paymentAccepted;
    }

    @Override
    public void setPaymentNotes(String paymentNotes) {
        this.paymentNotes = paymentNotes;
    }

    @Override
    public String getPaymentNotes() {
        return paymentNotes;
    }

    @Override
    public void setPickup(Boolean pickup) {
        this.pickup = pickup;
    }

    @Override
    public Boolean getPickup() {
        return pickup;
    }

    @Override
    public void setPrice(FloatUnit price) {
        this.price = price;
    }

    @Override
    public FloatUnit getPrice() {
        return price;
    }

    @Override
    public void setPriceType(PriceTypeEnumeration priceType) {
        this.priceType = priceType;
    }

    @Override
    public PriceTypeEnumeration getPriceType() {
        return priceType;
    }

    @Override
    public void setProcessorSpeed(FloatUnit processorSpeed) {
        this.processorSpeed = processorSpeed;
    }

    @Override
    public FloatUnit getProcessorSpeed() {
        return processorSpeed;
    }

    @Override
    public void setProductTypes(String[] productTypes) {
        this.productTypes = productTypes;
    }

    @Override
    public String[] getProductTypes() {
        return productTypes == null ? new String[0] : productTypes;
    }

    @Override
    public void setProgrammingLanguages(String[] programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
    }

    @Override
    public String[] getProgrammingLanguages() {
        return programmingLanguages == null ? new String[0] : programmingLanguages;
    }

    @Override
    public void setPropertyTypes(String[] propertyTypes) {
        this.propertyTypes = propertyTypes;
    }

    @Override
    public String[] getPropertyTypes() {
        return propertyTypes == null ? new String[0] : propertyTypes;
    }

    @Override
    public void setPublicationName(String publicationName) {
        this.publicationName = publicationName;
    }

    @Override
    public String getPublicationName() {
        return publicationName;
    }

    @Override
    public void setPublicationVolume(String publicationVolume) {
        this.publicationVolume = publicationVolume;
    }

    @Override
    public String getPublicationVolume() {
        return publicationVolume;
    }

    @Override
    public void setPublishDate(Date publishDate) {
        if ((publishDate != null) && !(publishDate instanceof ShortDate)) {
            this.publishDate = new ShortDate(publishDate);
        } else {
            this.publishDate = null;
        }
    }

    @Override
    public Date getPublishDate() {
        return publishDate;
    }

    @Override
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public Integer getQuantity() {
        return quantity;
    }

    @Override
    public void setRating(Float rating) {
        this.rating = rating;
    }

    @Override
    public Float getRating() {
        return rating;
    }

    @Override
    public void setRelatedLinks(URL[] relatedLinks) {
        this.relatedLinks = relatedLinks;
    }

    @Override
    public URL[] getRelatedLinks() {
        return relatedLinks == null ? new URL[0] : relatedLinks;
    }

    @Override
    public void setReviewType(String reviewType) {
        this.reviewType = reviewType;
    }

    @Override
    public String getReviewType() {
        return reviewType;
    }

    @Override
    public void setReviewerType(String reviewerType) {
        this.reviewerType = reviewerType;
    }

    @Override
    public String getReviewerType() {
        return reviewerType;
    }

    @Override
    public void setSalary(Float salary) {
        this.salary = salary;
    }

    @Override
    public Float getSalary() {
        return salary;
    }

    @Override
    public void setSalaryType(PriceTypeEnumeration salaryType) {
        this.salaryType = salaryType;
    }

    @Override
    public PriceTypeEnumeration getSalaryType() {
        return salaryType;
    }

    @Override
    public void setSchoolDistrict(String schoolDistrict) {
        this.schoolDistrict = schoolDistrict;
    }

    @Override
    public String getSchoolDistrict() {
        return schoolDistrict;
    }

    @Override
    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    @Override
    public String getServiceType() {
        return serviceType;
    }

    @Override
    public void setSexualOrientation(String SexualOrientation) {
        this.SexualOrientation = SexualOrientation;
    }

    @Override
    public String getSexualOrientation() {
        return SexualOrientation;
    }

    @Override
    public void setShipping(ShippingType[] shipping) {
        this.shipping = shipping;
    }

    @Override
    public ShippingType[] getShipping() {
        return shipping == null ? new ShippingType[0] : shipping;
    }

    @Override
    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public Size getSize() {
        return size;
    }

    @Override
    public void setSquareFootages(IntUnit[] squareFootages) {
        this.squareFootages = squareFootages;
    }

    @Override
    public IntUnit[] getSquareFootages() {
        return squareFootages == null ? new IntUnit[0] : squareFootages;
    }

    @Override
    public void setSubjectAreas(String[] subjectAreas) {
        this.subjectAreas = subjectAreas;
    }

    @Override
    public String[] getSubjectAreas() {
        return subjectAreas == null ? new String[0] : subjectAreas;
    }

    @Override
    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    @Override
    public String[] getSubjects() {
        return subjects == null ? new String[0] : subjects;
    }

    @Override
    public void setTaxPercent(Float taxPercent) {
        this.taxPercent = taxPercent;
    }

    @Override
    public Float getTaxPercent() {
        return taxPercent;
    }

    @Override
    public void setTaxRegion(String taxRegion) {
        this.taxRegion = taxRegion;
    }

    @Override
    public String getTaxRegion() {
        return taxRegion;
    }

    @Override
    public void setToLocation(String toLocation) {
        this.toLocation = toLocation;
    }

    @Override
    public String getToLocation() {
        return toLocation;
    }

    @Override
    public void setTravelDateRange(DateTimeRange travelDateRange) {
        this.travelDateRange = travelDateRange;
    }

    @Override
    public DateTimeRange getTravelDateRange() {
        return travelDateRange;
    }

    @Override
    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public String getUniversity() {
        return university;
    }

    @Override
    public void setUpc(String upc) {
        this.upc = upc;
    }

    @Override
    public String getUpc() {
        return upc;
    }

    @Override
    public String getUri() {
        return GoogleBase.URI;
    }

    @Override
    public void setUrlOfItemBeingReviewed(URL urlOfItemBeingReviewed) {
        this.urlOfItemBeingReviewed = urlOfItemBeingReviewed;
    }

    @Override
    public URL getUrlOfItemBeingReviewed() {
        return urlOfItemBeingReviewed;
    }

    @Override
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public String getVehicleType() {
        return vehicleType;
    }

    @Override
    public void setVin(String vin) {
        this.vin = vin;
    }

    @Override
    public String getVin() {
        return vin;
    }

    @Override
    public void setWeight(FloatUnit weight) {
        this.weight = weight;
    }

    @Override
    public FloatUnit getWeight() {
        return weight;
    }

    @Override
    public void setYear(YearType year) {
        this.year = year;
    }

    @Override
    public YearType getYear() {
        return year;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        try {
            GoogleBaseImpl gbi = new GoogleBaseImpl();
            gbi.copyFrom(this);

            return gbi;
        } catch (Exception e) {
            throw new CloneNotSupportedException();
        }
    }

    @Override
    public void copyFrom(Object obj) {
        if (!(obj instanceof GoogleBase)) {
            return;
        }

        GoogleBase source = (GoogleBase) obj;

        this.setActors((String[]) arrayCopy(source.getActors()));
        this.setAge(source.getAge());
        this.setAgents((String[]) arrayCopy(source.getAgents()));
        this.setApparelType(source.getApparelType());
        this.setArea(source.getArea());
        this.setArtists((String[]) arrayCopy(source.getArtists()));
        this.setAuthors((String[]) arrayCopy(source.getAuthors()));
        this.setBathrooms(source.getBathrooms());
        this.setBedrooms(source.getBedrooms());
        this.setBrand(source.getBrand());
        this.setColors((String[]) arrayCopy(source.getColors()));
        this.setCondition(source.getCondition());
        this.setCourseDateRange((DateTimeRange) cloneOrNull(source.getCourseDateRange()));
        this.setCourseNumber(source.getCourseNumber());
        this.setCourseTimes(source.getCourseTimes());
        this.setDeliveryNotes(source.getDeliveryNotes());
        this.setDeliveryRadius(source.getDeliveryRadius());
        this.setEducation(source.getEducation());
        this.setEmployer(source.getEmployer());
        this.setEthnicities((String[]) arrayCopy(source.getEthnicities()));
        this.setEventDateRange((DateTimeRange) cloneOrNull(source.getEventDateRange()));
        this.setExpirationDate(dateOrNull(source.getExpirationDate()));
        this.setExpirationDateTime(dateOrNull(source.getExpirationDateTime()));
        this.setFormat(source.getFormat());
        this.setFromLocation(source.getFromLocation());
        this.setGender(source.getGender());
        this.setHoaDues(source.getHoaDues());
        this.setId(source.getId());
        this.setImageLinks((URL[]) arrayCopy(source.getImageLinks()));
        this.setImmigrationStatus(source.getImmigrationStatus());
        this.setInterestedIn(source.getInterestedIn());
        this.setIsbn(source.getIsbn());
        this.setJobFunctions((String[]) arrayCopy(source.getJobFunctions()));
        this.setJobIndustries((String[]) arrayCopy(source.getJobIndustries()));
        this.setJobTypes((String[]) arrayCopy(source.getJobTypes()));
        this.setLabels((String[]) arrayCopy(source.getLabels()));
        this.setListingType(source.getListingType());
        this.setLocation(source.getLocation());
        this.setMake(source.getMake());
        this.setManufacturer(source.getManufacturer());
        this.setManufacturerId(source.getManufacturerId());
        this.setMaritalStatus(source.getMaritalStatus());
        this.setMegapixels(source.getMegapixels());
        this.setMemory(source.getMemory());
        this.setMileage(source.getMileage());
        this.setModel(source.getModel());
        this.setModelNumber(source.getModelNumber());
        this.setNameOfItemBeingReviewed(source.getNameOfItemBeingReviewed());
        this.setNewsSource(source.getNewsSource());
        this.setOccupation(source.getOccupation());
        this.setPages(source.getPages());
        this.setPaymentAccepted((PaymentTypeEnumeration[]) arrayCopy(source.getPaymentAccepted()));
        this.setPaymentNotes(source.getPaymentNotes());
        this.setPickup(source.getPickup());
        this.setPrice(source.getPrice());
        this.setPriceType(source.getPriceType());
        this.setProcessorSpeed(source.getProcessorSpeed());
        this.setProductTypes((String[]) arrayCopy(source.getProductTypes()));
        this.setPropertyTypes((String[]) arrayCopy(source.getPropertyTypes()));
        this.setPublicationName(source.getPublicationName());
        this.setPublicationVolume(source.getPublicationVolume());
        this.setPublishDate(dateOrNull(source.getPublishDate()));
        this.setQuantity(source.getQuantity());
        this.setRating(source.getRating());
        this.setReviewType(source.getReviewType());
        this.setReviewerType(source.getReviewerType());
        this.setSalary(source.getSalary());
        this.setSalaryType(source.getSalaryType());
        this.setServiceType(source.getServiceType());
        this.setSexualOrientation(source.getSexualOrientation());
        this.setShipping((ShippingType[]) arrayCopy(source.getShipping()));
        this.setSize(source.getSize());
        this.setSubjects((String[]) arrayCopy(source.getSubjects()));
        this.setTaxPercent(source.getTaxPercent());
        this.setTaxRegion(source.getTaxRegion());
        this.setToLocation(source.getToLocation());
        this.setTravelDateRange((DateTimeRange) cloneOrNull(source.getTravelDateRange()));
        this.setUpc(source.getUpc());
        this.setUrlOfItemBeingReviewed(source.getUrlOfItemBeingReviewed());
        this.setVehicleType(source.getVehicleType());
        this.setVin(source.getVin());
        this.setYear(source.getYear());
        this.setLicenses((String[]) arrayCopy(source.getLicenses()));
        this.setRelatedLinks((URL[]) arrayCopy(source.getRelatedLinks()));
        this.setSubjectAreas((String[]) arrayCopy(source.getSubjectAreas()));
        this.setProgrammingLanguages((String[]) arrayCopy(source.getProgrammingLanguages()));
        this.setSquareFootages(((IntUnit[]) arrayCopy(source.getSquareFootages())));
        this.setCurrency(source.getCurrency());
        this.setSchoolDistrict(source.getSchoolDistrict());
        this.setUniversity(source.getUniversity());
        this.setWeight(source.getWeight());
        this.setOperatingSystems(source.getOperatingSystems());
    }

    @Override
    public boolean equals(Object obj) {
        EqualsBean eBean = new EqualsBean(this.getClass(), this);

        return eBean.beanEquals(obj);
    }

    private Object arrayCopy(Object[] source) {
        if (source == null) {
            return null;
        }

        Object[] array = (Object[]) Array.newInstance(source.getClass().getComponentType(), source.length);

        for (int i = 0; i < source.length; i++) {
            array[i] = source[i];
        }

        return array;
    }

    private Object cloneOrNull(CloneableType o) {
        if (o == null) {
            return null;
        } else {
            return o.clone();
        }
    }

    private Date dateOrNull(Date date) {
        if (date == null) {
            return null;
        } else {
            return new Date(date.getTime());
        }
    }
}
