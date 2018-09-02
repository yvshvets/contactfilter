package com.celestialapps.contactfilter.service;

import com.celestialapps.contactfilter.model.Contact;
import com.celestialapps.contactfilter.request.ContactRequest;

import java.util.List;

public interface ContactService {



    List<Contact> getContactsWithJavaRegularFilter(String javaRegularFilter);
    List<Contact> addContacts(List<ContactRequest> contactRequests);



}
