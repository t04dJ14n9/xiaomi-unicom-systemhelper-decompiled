package e1;

import android.content.Context;
import android.telephony.PreciseDataConnectionState;
import android.telephony.TelephonyCallback;
import g1.h;
import g1.n;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class a extends TelephonyCallback implements TelephonyCallback.CallDisconnectCauseListener, TelephonyCallback.PreciseDataConnectionStateListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f2441d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f2442e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Map<Integer, String> f2443f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f2444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f2445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    n f2446c;

    static {
        HashMap map = new HashMap();
        f2443f = map;
        map.put(0, "NONE");
        map.put(8, "OPERATOR_BARRED");
        map.put(14, "NAS_SIGNALLING");
        map.put(25, "LLC_SNDCP");
        map.put(26, "INSUFFICIENT_RESOURCES");
        map.put(27, "MISSING_UNKNOWN_APN");
        map.put(28, "UNKNOWN_PDP_ADDRESS_TYPE");
        map.put(29, "USER_AUTHENTICATION");
        map.put(30, "ACTIVATION_REJECT_GGSN");
        map.put(31, "ACTIVATION_REJECT_UNSPECIFIED");
        map.put(32, "SERVICE_OPTION_NOT_SUPPORTED");
        map.put(33, "SERVICE_OPTION_NOT_SUBSCRIBED");
        map.put(34, "SERVICE_OPTION_OUT_OF_ORDER");
        map.put(35, "NSAPI_IN_USE");
        map.put(36, "REGULAR_DEACTIVATION");
        map.put(37, "QOS_NOT_ACCEPTED");
        map.put(38, "NETWORK_FAILURE");
        map.put(39, "UMTS_REACTIVATION_REQ");
        map.put(40, "FEATURE_NOT_SUPP");
        map.put(41, "TFT_SEMANTIC_ERROR");
        map.put(42, "TFT_SYTAX_ERROR");
        map.put(43, "UNKNOWN_PDP_CONTEXT");
        map.put(44, "FILTER_SEMANTIC_ERROR");
        map.put(45, "FILTER_SYTAX_ERROR");
        map.put(46, "PDP_WITHOUT_ACTIVE_TFT");
        map.put(48, "ACTIVATION_REJECTED_BCM_VIOLATION");
        map.put(50, "ONLY_IPV4_ALLOWED");
        map.put(51, "ONLY_IPV6_ALLOWED");
        map.put(52, "ONLY_SINGLE_BEARER_ALLOWED");
        map.put(53, "ESM_INFO_NOT_RECEIVED");
        map.put(54, "PDN_CONN_DOES_NOT_EXIST");
        map.put(55, "MULTI_CONN_TO_SAME_PDN_NOT_ALLOWED");
        map.put(56, "COLLISION_WITH_NETWORK_INITIATED_REQUEST");
        map.put(57, "ONLY_IPV4V6_ALLOWED");
        map.put(58, "ONLY_NON_IP_ALLOWED");
        map.put(59, "UNSUPPORTED_QCI_VALUE");
        map.put(60, "BEARER_HANDLING_NOT_SUPPORTED");
        map.put(65, "ACTIVE_PDP_CONTEXT_MAX_NUMBER_REACHED");
        map.put(66, "UNSUPPORTED_APN_IN_CURRENT_PLMN");
        map.put(81, "INVALID_TRANSACTION_ID");
        map.put(95, "MESSAGE_INCORRECT_SEMANTIC");
        map.put(96, "INVALID_MANDATORY_INFO");
        map.put(97, "MESSAGE_TYPE_UNSUPPORTED");
        map.put(98, "MSG_TYPE_NONCOMPATIBLE_STATE");
        map.put(99, "UNKNOWN_INFO_ELEMENT");
        map.put(100, "CONDITIONAL_IE_ERROR");
        map.put(101, "MSG_AND_PROTOCOL_STATE_UNCOMPATIBLE");
        map.put(111, "PROTOCOL_ERRORS");
        map.put(112, "APN_TYPE_CONFLICT");
        map.put(113, "INVALID_PCSCF_ADDR");
        map.put(114, "INTERNAL_CALL_PREEMPT_BY_HIGH_PRIO_APN");
        map.put(115, "EMM_ACCESS_BARRED");
        map.put(116, "EMERGENCY_IFACE_ONLY");
        map.put(117, "IFACE_MISMATCH");
        map.put(118, "COMPANION_IFACE_IN_USE");
        map.put(119, "IP_ADDRESS_MISMATCH");
        map.put(120, "IFACE_AND_POL_FAMILY_MISMATCH");
        map.put(121, "EMM_ACCESS_BARRED_INFINITE_RETRY");
        map.put(122, "AUTH_FAILURE_ON_EMERGENCY_CALL");
        map.put(123, "INVALID_DNS_ADDR");
        map.put(124, "INVALID_PCSCF_OR_DNS_ADDRESS");
        map.put(127, "CALL_PREEMPT_BY_EMERGENCY_APN");
        map.put(128, "UE_INITIATED_DETACH_OR_DISCONNECT");
        map.put(2000, "MIP_FA_REASON_UNSPECIFIED");
        map.put(2001, "MIP_FA_ADMIN_PROHIBITED");
        map.put(2002, "MIP_FA_INSUFFICIENT_RESOURCES");
        map.put(2003, "MIP_FA_MOBILE_NODE_AUTHENTICATION_FAILURE");
        map.put(2004, "MIP_FA_HOME_AGENT_AUTHENTICATION_FAILURE");
        map.put(2005, "MIP_FA_REQUESTED_LIFETIME_TOO_LONG");
        map.put(2006, "MIP_FA_MALFORMED_REQUEST");
        map.put(2007, "MIP_FA_MALFORMED_REPLY");
        map.put(2008, "MIP_FA_ENCAPSULATION_UNAVAILABLE");
        map.put(2009, "MIP_FA_VJ_HEADER_COMPRESSION_UNAVAILABLE");
        map.put(2010, "MIP_FA_REVERSE_TUNNEL_UNAVAILABLE");
        map.put(2011, "MIP_FA_REVERSE_TUNNEL_IS_MANDATORY");
        map.put(2012, "MIP_FA_DELIVERY_STYLE_NOT_SUPPORTED");
        map.put(2013, "MIP_FA_MISSING_NAI");
        map.put(2014, "MIP_FA_MISSING_HOME_AGENT");
        map.put(2015, "MIP_FA_MISSING_HOME_ADDRESS");
        map.put(2016, "MIP_FA_UNKNOWN_CHALLENGE");
        map.put(2017, "MIP_FA_MISSING_CHALLENGE");
        map.put(2018, "MIP_FA_STALE_CHALLENGE");
        map.put(2019, "MIP_HA_REASON_UNSPECIFIED");
        map.put(2020, "MIP_HA_ADMIN_PROHIBITED");
        map.put(2021, "MIP_HA_INSUFFICIENT_RESOURCES");
        map.put(2022, "MIP_HA_MOBILE_NODE_AUTHENTICATION_FAILURE");
        map.put(2023, "MIP_HA_FOREIGN_AGENT_AUTHENTICATION_FAILURE");
        map.put(2024, "MIP_HA_REGISTRATION_ID_MISMATCH");
        map.put(2025, "MIP_HA_MALFORMED_REQUEST");
        map.put(2026, "MIP_HA_UNKNOWN_HOME_AGENT_ADDRESS");
        map.put(2027, "MIP_HA_REVERSE_TUNNEL_UNAVAILABLE");
        map.put(2028, "MIP_HA_REVERSE_TUNNEL_IS_MANDATORY");
        map.put(2029, "MIP_HA_ENCAPSULATION_UNAVAILABLE");
        map.put(2030, "CLOSE_IN_PROGRESS");
        map.put(2031, "NETWORK_INITIATED_TERMINATION");
        map.put(2032, "MODEM_APP_PREEMPTED");
        map.put(2033, "PDN_IPV4_CALL_DISALLOWED");
        map.put(2034, "PDN_IPV4_CALL_THROTTLED");
        map.put(2035, "PDN_IPV6_CALL_DISALLOWED");
        map.put(2036, "PDN_IPV6_CALL_THROTTLED");
        map.put(2037, "MODEM_RESTART");
        map.put(2038, "PDP_PPP_NOT_SUPPORTED");
        map.put(2039, "UNPREFERRED_RAT");
        map.put(2040, "PHYSICAL_LINK_CLOSE_IN_PROGRESS");
        map.put(2041, "APN_PENDING_HANDOVER");
        map.put(2042, "PROFILE_BEARER_INCOMPATIBLE");
        map.put(2043, "SIM_CARD_CHANGED");
        map.put(2044, "LOW_POWER_MODE_OR_POWERING_DOWN");
        map.put(2045, "APN_DISABLED");
        map.put(2046, "MAX_PPP_INACTIVITY_TIMER_EXPIRED");
        map.put(2047, "IPV6_ADDRESS_TRANSFER_FAILED");
        map.put(2048, "TRAT_SWAP_FAILED");
        map.put(2049, "EHRPD_TO_HRPD_FALLBACK");
        map.put(2050, "MIP_CONFIG_FAILURE");
        map.put(2051, "PDN_INACTIVITY_TIMER_EXPIRED");
        map.put(2052, "MAX_IPV4_CONNECTIONS");
        map.put(2053, "MAX_IPV6_CONNECTIONS");
        map.put(2054, "APN_MISMATCH");
        map.put(2055, "IP_VERSION_MISMATCH");
        map.put(2056, "DUN_CALL_DISALLOWED");
        map.put(2057, "INTERNAL_EPC_NONEPC_TRANSITION");
        map.put(2058, "INTERFACE_IN_USE");
        map.put(2059, "APN_DISALLOWED_ON_ROAMING");
        map.put(2060, "APN_PARAMETERS_CHANGED");
        map.put(2061, "NULL_APN_DISALLOWED");
        map.put(2062, "THERMAL_MITIGATION");
        map.put(2063, "DATA_SETTINGS_DISABLED");
        map.put(2064, "DATA_ROAMING_SETTINGS_DISABLED");
        map.put(2065, "DDS_SWITCHED");
        map.put(2066, "FORBIDDEN_APN_NAME");
        map.put(2067, "DDS_SWITCH_IN_PROGRESS");
        map.put(2068, "CALL_DISALLOWED_IN_ROAMING");
        map.put(2069, "NON_IP_NOT_SUPPORTED");
        map.put(2070, "PDN_NON_IP_CALL_THROTTLED");
        map.put(2071, "PDN_NON_IP_CALL_DISALLOWED");
        map.put(2072, "CDMA_LOCK");
        map.put(2073, "CDMA_INTERCEPT");
        map.put(2074, "CDMA_REORDER");
        map.put(2075, "CDMA_RELEASE_DUE_TO_SO_REJECTION");
        map.put(2076, "CDMA_INCOMING_CALL");
        map.put(2077, "CDMA_ALERT_STOP");
        map.put(2078, "CHANNEL_ACQUISITION_FAILURE");
        map.put(2079, "MAX_ACCESS_PROBE");
        map.put(2080, "CONCURRENT_SERVICE_NOT_SUPPORTED_BY_BASE_STATION");
        map.put(2081, "NO_RESPONSE_FROM_BASE_STATION");
        map.put(2082, "REJECTED_BY_BASE_STATION");
        map.put(2083, "CONCURRENT_SERVICES_INCOMPATIBLE");
        map.put(2084, "NO_CDMA_SERVICE");
        map.put(2085, "RUIM_NOT_PRESENT");
        map.put(2086, "CDMA_RETRY_ORDER");
        map.put(2087, "ACCESS_BLOCK");
        map.put(2088, "ACCESS_BLOCK_ALL");
        map.put(2089, "IS707B_MAX_ACCESS_PROBES");
        map.put(2090, "THERMAL_EMERGENCY");
        map.put(2091, "CONCURRENT_SERVICES_NOT_ALLOWED");
        map.put(2092, "INCOMING_CALL_REJECTED");
        map.put(2093, "NO_SERVICE_ON_GATEWAY");
        map.put(2094, "NO_GPRS_CONTEXT");
        map.put(2095, "ILLEGAL_MS");
        map.put(2096, "ILLEGAL_ME");
        map.put(2097, "GPRS_SERVICES_AND_NON_GPRS_SERVICES_NOT_ALLOWED");
        map.put(2098, "GPRS_SERVICES_NOT_ALLOWED");
        map.put(2099, "MS_IDENTITY_CANNOT_BE_DERIVED_BY_THE_NETWORK");
        map.put(2100, "IMPLICITLY_DETACHED");
        map.put(2101, "PLMN_NOT_ALLOWED");
        map.put(2102, "LOCATION_AREA_NOT_ALLOWED");
        map.put(2103, "GPRS_SERVICES_NOT_ALLOWED_IN_THIS_PLMN");
        map.put(2104, "PDP_DUPLICATE");
        map.put(2105, "UE_RAT_CHANGE");
        map.put(2106, "CONGESTION");
        map.put(2107, "NO_PDP_CONTEXT_ACTIVATED");
        map.put(2108, "ACCESS_CLASS_DSAC_REJECTION");
        map.put(2109, "PDP_ACTIVATE_MAX_RETRY_FAILED");
        map.put(2110, "RADIO_ACCESS_BEARER_FAILURE");
        map.put(2111, "ESM_UNKNOWN_EPS_BEARER_CONTEXT");
        map.put(2112, "DRB_RELEASED_BY_RRC");
        map.put(2113, "CONNECTION_RELEASED");
        map.put(2114, "EMM_DETACHED");
        map.put(2115, "EMM_ATTACH_FAILED");
        map.put(2116, "EMM_ATTACH_STARTED");
        map.put(2117, "LTE_NAS_SERVICE_REQUEST_FAILED");
        map.put(2118, "DUPLICATE_BEARER_ID");
        map.put(2119, "ESM_COLLISION_SCENARIOS");
        map.put(2120, "ESM_BEARER_DEACTIVATED_TO_SYNC_WITH_NETWORK");
        map.put(2121, "ESM_NW_ACTIVATED_DED_BEARER_WITH_ID_OF_DEF_BEARER");
        map.put(2122, "ESM_BAD_OTA_MESSAGE");
        map.put(2123, "ESM_DOWNLOAD_SERVER_REJECTED_THE_CALL");
        map.put(2124, "ESM_CONTEXT_TRANSFERRED_DUE_TO_IRAT");
        map.put(2125, "DS_EXPLICIT_DEACTIVATION");
        map.put(2126, "ESM_LOCAL_CAUSE_NONE");
        map.put(2127, "LTE_THROTTLING_NOT_REQUIRED");
        map.put(2128, "ACCESS_CONTROL_LIST_CHECK_FAILURE");
        map.put(2129, "SERVICE_NOT_ALLOWED_ON_PLMN");
        map.put(2130, "EMM_T3417_EXPIRED");
        map.put(2131, "EMM_T3417_EXT_EXPIRED");
        map.put(2132, "RRC_UPLINK_DATA_TRANSMISSION_FAILURE");
        map.put(2133, "RRC_UPLINK_DELIVERY_FAILED_DUE_TO_HANDOVER");
        map.put(2134, "RRC_UPLINK_CONNECTION_RELEASE");
        map.put(2135, "RRC_UPLINK_RADIO_LINK_FAILURE");
        map.put(2136, "RRC_UPLINK_ERROR_REQUEST_FROM_NAS");
        map.put(2137, "RRC_CONNECTION_ACCESS_STRATUM_FAILURE");
        map.put(2138, "RRC_CONNECTION_ANOTHER_PROCEDURE_IN_PROGRESS");
        map.put(2139, "RRC_CONNECTION_ACCESS_BARRED");
        map.put(2140, "RRC_CONNECTION_CELL_RESELECTION");
        map.put(2141, "RRC_CONNECTION_CONFIG_FAILURE");
        map.put(2142, "RRC_CONNECTION_TIMER_EXPIRED");
        map.put(2143, "RRC_CONNECTION_LINK_FAILURE");
        map.put(2144, "RRC_CONNECTION_CELL_NOT_CAMPED");
        map.put(2145, "RRC_CONNECTION_SYSTEM_INTERVAL_FAILURE");
        map.put(2146, "RRC_CONNECTION_REJECT_BY_NETWORK");
        map.put(2147, "RRC_CONNECTION_NORMAL_RELEASE");
        map.put(2148, "RRC_CONNECTION_RADIO_LINK_FAILURE");
        map.put(2149, "RRC_CONNECTION_REESTABLISHMENT_FAILURE");
        map.put(2150, "RRC_CONNECTION_OUT_OF_SERVICE_DURING_CELL_REGISTER");
        map.put(2151, "RRC_CONNECTION_ABORT_REQUEST");
        map.put(2152, "RRC_CONNECTION_SYSTEM_INFORMATION_BLOCK_READ_ERROR");
        map.put(2153, "NETWORK_INITIATED_DETACH_WITH_AUTO_REATTACH");
        map.put(2154, "NETWORK_INITIATED_DETACH_NO_AUTO_REATTACH");
        map.put(2155, "ESM_PROCEDURE_TIME_OUT");
        map.put(2156, "INVALID_CONNECTION_ID");
        map.put(2157, "MAXIMIUM_NSAPIS_EXCEEDED");
        map.put(2158, "INVALID_PRIMARY_NSAPI");
        map.put(2159, "CANNOT_ENCODE_OTA_MESSAGE");
        map.put(2160, "RADIO_ACCESS_BEARER_SETUP_FAILURE");
        map.put(2161, "PDP_ESTABLISH_TIMEOUT_EXPIRED");
        map.put(2162, "PDP_MODIFY_TIMEOUT_EXPIRED");
        map.put(2163, "PDP_INACTIVE_TIMEOUT_EXPIRED");
        map.put(2164, "PDP_LOWERLAYER_ERROR");
        map.put(2165, "PDP_MODIFY_COLLISION");
        map.put(2166, "MAXINUM_SIZE_OF_L2_MESSAGE_EXCEEDED");
        map.put(2167, "NAS_REQUEST_REJECTED_BY_NETWORK");
        map.put(2168, "RRC_CONNECTION_INVALID_REQUEST");
        map.put(2169, "RRC_CONNECTION_TRACKING_AREA_ID_CHANGED");
        map.put(2170, "RRC_CONNECTION_RF_UNAVAILABLE");
        map.put(2171, "RRC_CONNECTION_ABORTED_DUE_TO_IRAT_CHANGE");
        map.put(2172, "RRC_CONNECTION_RELEASED_SECURITY_NOT_ACTIVE");
        map.put(2173, "RRC_CONNECTION_ABORTED_AFTER_HANDOVER");
        map.put(2174, "RRC_CONNECTION_ABORTED_AFTER_IRAT_CELL_CHANGE");
        map.put(2175, "RRC_CONNECTION_ABORTED_DURING_IRAT_CELL_CHANGE");
        map.put(2176, "IMSI_UNKNOWN_IN_HOME_SUBSCRIBER_SERVER");
        map.put(2177, "IMEI_NOT_ACCEPTED");
        map.put(2178, "EPS_SERVICES_AND_NON_EPS_SERVICES_NOT_ALLOWED");
        map.put(2179, "EPS_SERVICES_NOT_ALLOWED_IN_PLMN");
        map.put(2180, "MSC_TEMPORARILY_NOT_REACHABLE");
        map.put(2181, "CS_DOMAIN_NOT_AVAILABLE");
        map.put(2182, "ESM_FAILURE");
        map.put(2183, "MAC_FAILURE");
        map.put(2184, "SYNCHRONIZATION_FAILURE");
        map.put(2185, "UE_SECURITY_CAPABILITIES_MISMATCH");
        map.put(2186, "SECURITY_MODE_REJECTED");
        map.put(2187, "UNACCEPTABLE_NON_EPS_AUTHENTICATION");
        map.put(2188, "CS_FALLBACK_CALL_ESTABLISHMENT_NOT_ALLOWED");
        map.put(2189, "NO_EPS_BEARER_CONTEXT_ACTIVATED");
        map.put(2190, "INVALID_EMM_STATE");
        map.put(2191, "NAS_LAYER_FAILURE");
        map.put(2192, "MULTIPLE_PDP_CALL_NOT_ALLOWED");
        map.put(2193, "EMBMS_NOT_ENABLED");
        map.put(2194, "IRAT_HANDOVER_FAILED");
        map.put(2195, "EMBMS_REGULAR_DEACTIVATION");
        map.put(2196, "TEST_LOOPBACK_REGULAR_DEACTIVATION");
        map.put(2197, "LOWER_LAYER_REGISTRATION_FAILURE");
        map.put(2198, "DATA_PLAN_EXPIRED");
        map.put(2199, "UMTS_HANDOVER_TO_IWLAN");
        map.put(2200, "EVDO_CONNECTION_DENY_BY_GENERAL_OR_NETWORK_BUSY");
        map.put(2201, "EVDO_CONNECTION_DENY_BY_BILLING_OR_AUTHENTICATION_FAILURE");
        map.put(2202, "EVDO_HDR_CHANGED");
        map.put(2203, "EVDO_HDR_EXITED");
        map.put(2204, "EVDO_HDR_NO_SESSION");
        map.put(2205, "EVDO_USING_GPS_FIX_INSTEAD_OF_HDR_CALL");
        map.put(2206, "EVDO_HDR_CONNECTION_SETUP_TIMEOUT");
        map.put(2207, "FAILED_TO_ACQUIRE_COLOCATED_HDR");
        map.put(2208, "OTASP_COMMIT_IN_PROGRESS");
        map.put(2209, "NO_HYBRID_HDR_SERVICE");
        map.put(2210, "HDR_NO_LOCK_GRANTED");
        map.put(2211, "DBM_OR_SMS_IN_PROGRESS");
        map.put(2212, "HDR_FADE");
        map.put(2213, "HDR_ACCESS_FAILURE");
        map.put(2214, "UNSUPPORTED_1X_PREV");
        map.put(2215, "LOCAL_END");
        map.put(2216, "NO_SERVICE");
        map.put(2217, "FADE");
        map.put(2218, "NORMAL_RELEASE");
        map.put(2219, "ACCESS_ATTEMPT_ALREADY_IN_PROGRESS");
        map.put(2220, "REDIRECTION_OR_HANDOFF_IN_PROGRESS");
        map.put(2221, "EMERGENCY_MODE");
        map.put(2222, "PHONE_IN_USE");
        map.put(2223, "INVALID_MODE");
        map.put(2224, "INVALID_SIM_STATE");
        map.put(2225, "NO_COLLOCATED_HDR");
        map.put(2226, "UE_IS_ENTERING_POWERSAVE_MODE");
        map.put(2227, "DUAL_SWITCH");
        map.put(2228, "PPP_TIMEOUT");
        map.put(2229, "PPP_AUTH_FAILURE");
        map.put(2230, "PPP_OPTION_MISMATCH");
        map.put(2231, "PPP_PAP_FAILURE");
        map.put(2232, "PPP_CHAP_FAILURE");
        map.put(2233, "PPP_CLOSE_IN_PROGRESS");
        map.put(2234, "LIMITED_TO_IPV4");
        map.put(2235, "LIMITED_TO_IPV6");
        map.put(2236, "VSNCP_TIMEOUT");
        map.put(2237, "VSNCP_GEN_ERROR");
        map.put(2238, "VSNCP_APN_UNATHORIZED");
        map.put(2238, "VSNCP_APN_UNAUTHORIZED");
        map.put(2239, "VSNCP_PDN_LIMIT_EXCEEDED");
        map.put(2240, "VSNCP_NO_PDN_GATEWAY_ADDRESS");
        map.put(2241, "VSNCP_PDN_GATEWAY_UNREACHABLE");
        map.put(2242, "VSNCP_PDN_GATEWAY_REJECT");
        map.put(2243, "VSNCP_INSUFFICIENT_PARAMETERS");
        map.put(2244, "VSNCP_RESOURCE_UNAVAILABLE");
        map.put(2245, "VSNCP_ADMINISTRATIVELY_PROHIBITED");
        map.put(2246, "VSNCP_PDN_ID_IN_USE");
        map.put(2247, "VSNCP_SUBSCRIBER_LIMITATION");
        map.put(2248, "VSNCP_PDN_EXISTS_FOR_THIS_APN");
        map.put(2249, "VSNCP_RECONNECT_NOT_ALLOWED");
        map.put(2250, "IPV6_PREFIX_UNAVAILABLE");
        map.put(2251, "HANDOFF_PREFERENCE_CHANGED");
        map.put(2252, "SLICE_REJECTED");
        map.put(2253, "MATCH_ALL_RULE_NOT_ALLOWED");
        map.put(2254, "ALL_MATCHING_RULES_FAILED");
        map.put(8192, "IWLAN_PDN_CONNECTION_REJECTION");
        map.put(8193, "IWLAN_MAX_CONNECTION_REACHED");
        map.put(8241, "IWLAN_SEMANTIC_ERROR_IN_THE_TFT_OPERATION");
        map.put(8242, "IWLAN_SYNTACTICAL_ERROR_IN_THE_TFT_OPERATION");
        map.put(8244, "IWLAN_SEMANTIC_ERRORS_IN_PACKET_FILTERS");
        map.put(8245, "IWLAN_SYNTACTICAL_ERRORS_IN_PACKET_FILTERS");
        map.put(9000, "IWLAN_NON_3GPP_ACCESS_TO_EPC_NOT_ALLOWED");
        map.put(9001, "IWLAN_USER_UNKNOWN");
        map.put(9002, "IWLAN_NO_APN_SUBSCRIPTION");
        map.put(9003, "IWLAN_AUTHORIZATION_REJECTED");
        map.put(9006, "IWLAN_ILLEGAL_ME");
        map.put(10500, "IWLAN_NETWORK_FAILURE");
        map.put(11001, "IWLAN_RAT_TYPE_NOT_ALLOWED");
        map.put(11005, "IWLAN_IMEI_NOT_ACCEPTED");
        map.put(11011, "IWLAN_PLMN_NOT_ALLOWED");
        map.put(11055, "IWLAN_UNAUTHENTICATED_EMERGENCY_NOT_SUPPORTED");
        map.put(16384, "IWLAN_IKEV2_CONFIG_FAILURE");
        map.put(16385, "IWLAN_IKEV2_AUTH_FAILURE");
        map.put(16386, "IWLAN_IKEV2_MSG_TIMEOUT");
        map.put(16387, "IWLAN_IKEV2_CERT_INVALID");
        map.put(16388, "IWLAN_DNS_RESOLUTION_NAME_FAILURE");
        map.put(16389, "IWLAN_DNS_RESOLUTION_TIMEOUT");
        map.put(4097, "OEM_DCFAILCAUSE_1");
        map.put(4098, "OEM_DCFAILCAUSE_2");
        map.put(4099, "OEM_DCFAILCAUSE_3");
        map.put(4100, "OEM_DCFAILCAUSE_4");
        map.put(4101, "OEM_DCFAILCAUSE_5");
        map.put(4102, "OEM_DCFAILCAUSE_6");
        map.put(4103, "OEM_DCFAILCAUSE_7");
        map.put(4104, "OEM_DCFAILCAUSE_8");
        map.put(4105, "OEM_DCFAILCAUSE_9");
        map.put(4106, "OEM_DCFAILCAUSE_10");
        map.put(4107, "OEM_DCFAILCAUSE_11");
        map.put(4108, "OEM_DCFAILCAUSE_12");
        map.put(4109, "OEM_DCFAILCAUSE_13");
        map.put(4110, "OEM_DCFAILCAUSE_14");
        map.put(4111, "OEM_DCFAILCAUSE_15");
        map.put(-1, "REGISTRATION_FAIL");
        map.put(-2, "GPRS_REGISTRATION_FAIL");
        map.put(-3, "SIGNAL_LOST");
        map.put(-4, "PREF_RADIO_TECH_CHANGED");
        map.put(-5, "RADIO_POWER_OFF");
        map.put(-6, "TETHERED_CALL_ACTIVE");
        map.put(65535, "ERROR_UNSPECIFIED");
        map.put(65536, "UNKNOWN");
        map.put(65537, "RADIO_NOT_AVAILABLE");
        map.put(65538, "UNACCEPTABLE_NETWORK_PARAMETER");
        map.put(65540, "LOST_CONNECTION");
        map.put(65542, "HANDOVER_FAILED");
        map.put(65543, "DUPLICATE_CID");
        map.put(65544, "NO_DEFAULT_DATA");
        map.put(65545, "SERVICE_TEMPORARILY_UNAVAILABLE");
        map.put(65546, "REQUEST_NOT_SUPPORTED");
        map.put(65547, "NO_RETRY_FAILURE");
    }

    public a(Context context, int i2) {
        this.f2444a = null;
        this.f2445b = -1;
        n nVar = new n();
        this.f2446c = nVar;
        this.f2444a = context;
        this.f2445b = i2;
        f2441d = nVar.f2713z;
        f2442e = nVar.A;
    }

    private String a(int i2) {
        switch (i2) {
            case 0:
                return "NOT_DISCONNECTED";
            case 1:
                return "INCOMING_MISSED";
            case 2:
                return "NORMAL";
            case 3:
                return "LOCAL";
            case 4:
                return "BUSY";
            case 5:
                return "CONGESTION";
            case 6:
            case 56:
            default:
                return "INVALID: " + i2;
            case 7:
                return "INVALID_NUMBER";
            case 8:
                return "NUMBER_UNREACHABLE";
            case 9:
                return "SERVER_UNREACHABLE";
            case 10:
                return "INVALID_CREDENTIALS";
            case 11:
                return "OUT_OF_NETWORK";
            case 12:
                return "SERVER_ERROR";
            case 13:
                return "TIMED_OUT";
            case 14:
                return "LOST_SIGNAL";
            case 15:
                return "LIMIT_EXCEEDED";
            case 16:
                return "INCOMING_REJECTED";
            case 17:
                return "POWER_OFF";
            case 18:
                return "OUT_OF_SERVICE";
            case 19:
                return "ICC_ERROR";
            case 20:
                return "CALL_BARRED";
            case 21:
                return "FDN_BLOCKED";
            case 22:
                return "CS_RESTRICTED";
            case 23:
                return "CS_RESTRICTED_NORMAL";
            case 24:
                return "CS_RESTRICTED_EMERGENCY";
            case 25:
                return "UNOBTAINABLE_NUMBER";
            case 26:
                return "CDMA_LOCKED_UNTIL_POWER_CYCLE";
            case 27:
                return "CDMA_DROP";
            case 28:
                return "CDMA_INTERCEPT";
            case 29:
                return "CDMA_REORDER";
            case 30:
                return "CDMA_SO_REJECT";
            case 31:
                return "CDMA_RETRY_ORDER";
            case 32:
                return "CDMA_ACCESS_FAILURE";
            case 33:
                return "CDMA_PREEMPTED";
            case 34:
                return "CDMA_NOT_EMERGENCY";
            case 35:
                return "CDMA_ACCESS_BLOCKED";
            case 36:
                return "ERROR_UNSPECIFIED";
            case 37:
                return "EMERGENCY_ONLY";
            case 38:
                return "NO_PHONE_NUMBER_SUPPLIED";
            case 39:
                return "DIALED_MMI";
            case 40:
                return "VOICEMAIL_NUMBER_MISSING";
            case 41:
                return "CDMA_CALL_LOST";
            case 42:
                return "EXITED_ECM";
            case 43:
                return "OUTGOING_FAILURE";
            case 44:
                return "OUTGOING_CANCELED";
            case 45:
                return "IMS_MERGED_SUCCESSFULLY";
            case 46:
                return "DIAL_MODIFIED_TO_USSD";
            case 47:
                return "DIAL_MODIFIED_TO_SS";
            case 48:
                return "DIAL_MODIFIED_TO_DIAL";
            case 49:
                return "CDMA_ALREADY_ACTIVATED";
            case 50:
                return "VIDEO_CALL_NOT_ALLOWED_WHILE_TTY_ENABLED";
            case 51:
                return "CALL_PULLED";
            case 52:
                return "ANSWERED_ELSEWHERE";
            case 53:
                return "MAXIMUM_NUMER_OF_CALLS_REACHED";
            case 54:
                return "DATA_DISABLED";
            case 55:
                return "DATA_LIMIT_REACHED";
            case 57:
                return "DIALED_CALL_FORWARDING_WHILE_ROAMING";
            case 58:
                return "IMEI_NOT_ACCEPTED";
            case 59:
                return "WIFI_LOST";
            case 60:
                return "IMS_ACCESS_BLOCKED";
            case 61:
                return "LOW_BATTERY";
            case 62:
                return "DIAL_LOW_BATTERY";
            case 63:
                return "EMERGENCY_TEMP_FAILURE";
            case 64:
                return "EMERGENCY_PERM_FAILURE";
            case 65:
                return "NORMAL_UNSPECIFIED";
            case 66:
                return "DIAL_MODIFIED_TO_DIAL_VIDEO";
            case 67:
                return "DIAL_VIDEO_MODIFIED_TO_SS";
            case 68:
                return "DIAL_VIDEO_MODIFIED_TO_USSD";
            case 69:
                return "DIAL_VIDEO_MODIFIED_TO_DIAL";
            case 70:
                return "DIAL_VIDEO_MODIFIED_TO_DIAL_VIDEO";
            case 71:
                return "IMS_SIP_ALTERNATE_EMERGENCY_CALL";
            case 72:
                return "ALREADY_DIALING";
            case 73:
                return "CANT_CALL_WHILE_RINGING";
            case 74:
                return "CALLING_DISABLED";
            case 75:
                return "TOO_MANY_ONGOING_CALLS";
            case 76:
                return "OTASP_PROVISIONING_IN_PROCESS";
            case 77:
                return "MEDIA_TIMEOUT";
            case 78:
                return "EMERGENCY_CALL_OVER_WFC_NOT_AVAILABLE";
            case 79:
                return "WFC_SERVICE_NOT_AVAILABLE_IN_THIS_LOCATION";
            case 80:
                return "OUTGOING_EMERGENCY_CALL_PLACED";
            case 81:
                return "INCOMING_AUTO_REJECTED";
        }
    }

    @Override // android.telephony.TelephonyCallback.CallDisconnectCauseListener
    public void onCallDisconnectCauseChanged(int i2, int i3) {
        StringBuilder sb;
        String str;
        h.b("DMTelephonyCallback", "onCallDisconnectCauseChanged-->disconnectCause:" + i2 + ", preciseDisconnectCause:" + i3);
        if (i2 != -1) {
            this.f2446c.f2713z = a(i2);
            f2441d = this.f2446c.f2713z;
            sb = new StringBuilder();
            str = "default disconnectcause : ";
        } else {
            this.f2446c.f2713z = "";
            f2441d = "";
            sb = new StringBuilder();
            str = "case 1 disconnectcause : ";
        }
        sb.append(str);
        sb.append(f2441d);
        h.a("DMTelephonyCallback", sb.toString());
    }

    @Override // android.telephony.TelephonyCallback.PreciseDataConnectionStateListener
    public void onPreciseDataConnectionStateChanged(PreciseDataConnectionState preciseDataConnectionState) {
        if (preciseDataConnectionState != null) {
            h.b("DMTelephonyCallback", "onPreciseDataConnectionStateChanged-->dataConnectionState:" + preciseDataConnectionState.toString());
            int lastCauseCode = preciseDataConnectionState.getLastCauseCode();
            if (lastCauseCode == 0) {
                this.f2446c.A = "";
                f2442e = "";
            } else {
                this.f2446c.A = f2443f.get(Integer.valueOf(lastCauseCode));
                f2442e = this.f2446c.A;
            }
        }
    }
}
