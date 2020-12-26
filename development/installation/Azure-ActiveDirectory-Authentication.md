---
layout: default
title: CAS - Microsoft Azure Active Directory Authentication
category: Authentication
---

# Microsoft Azure Active Directory Authentication

[Azure Active Directory (Azure AD)](https://docs.microsoft.com/en-us/azure/active-directory/fundamentals/active-directory-whatis) is Microsoft’s cloud-based identity and access management service. The functionality described here allows one to authenticate credentials using 
Azure Active Directory as the account store and optionally fetch user attributes using Microsoft Graph. 

## Configuration

Support is enabled by including the following dependency in the WAR overlay:

{% include casmodule.html group="org.apereo.cas" module="cas-server-support-azuread-authentication" %}

To see the relevant list of CAS properties, please [review this guide](../configuration/Configuration-Properties.html#microsoft-azure-active-directory-authentication).

## Principal Attributes

The above dependency may also be used, in the event that principal attributes need to be fetched from Azure Active Directory without 
necessarily authenticating credentials . To see the relevant list of CAS properties, please [review this guide](..configuration/Configuration-Properties.html#microsoft-azure-active-directory.