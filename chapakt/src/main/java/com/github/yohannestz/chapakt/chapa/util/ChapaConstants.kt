package com.github.yohannestz.chapakt.chapa.util

object ChapaConstants {
    //urls
    const val baseMobileUrl = "https://api.chapa.co/v1/transaction/mobile-initialize"
    const val BASE_URL = "https://api.chapa.co/v1/"
    const val CHARGE_CARD_URL = "charges?type=card"
    const val VALIDATE_CHARGE = "validate-charge"
    const val DEFAULT_REDIRECT_URL = "https://chapa.co/"
    const val BASE_MOBILE_INIT_URL = "transaction/initialize"
    const val VERIFY_TRANSACTION = "transaction/verify"
    const val GET_SUPPORTED_BANKS = "banks"
    const val SUBACCOUNT_URL = "subaccount"
    const val INITIATE_TRANSFER = "transfers"

    //messages
    const val publicKeyRequired = "Public key is required"
    const val currencyRequired = "Currency is required"
    const val amountRequired = "Amount is required";
    const val emailRequired = "Email is required";
    const val firstNameRequired = "First Name is required";
    const val lastNameRequired = "First Name is required";
    const val transactionReferenceRequired = "Transaction is required";
    const val connectionError = "Connectivity Issue";

    //Intent Extra
    const val TRANSACTION_EXTRA_RETURN_URL = "RETURN_URL"
    const val TRANSACTION_EXTRA_CHECKOUT_URL = "CHECKOUT_URL"
    const val TRANSACTION_EXTRA_TX_REF = "TX_REF"
    const val TRANSACTION_EXTRA_PAYMENT_RESULT = "PAYMENT_RESULT"
}
