package com.fan.common.utils;

public class ConstantUtils {

    //faceId
	public static final String MEGLIVE_FACE_IMG_PREFIX = "meglive_face_";
	public static final String REF_IMG_PREFIX = "ref_img_";
	public static final String RAW_IMG_PREFIX = "raw_";
	public static final String FACE_FILE_PATH = "faceId";

    //OCR
    public static final String SEPARATOR = "|";
	public static final String OCR_IMG_PREFIX = "ocr_img_";
	public static final String OCR_FILE_PATH = "ocr";

	//loan
	public static final String LOAN_PREFIX_CHAR ="B";
	//MPF 还款账号前缀号码
	public static final String MPF_VIA_NO = "00";

    //account


    //core

	//payment
	public interface PaymentConstant{
		//消费金融默认bank相关值
		String CONSUMER_BANKACCOUNTNO = "9999";
		String CONSUMER_BANKACCOUNTNAME = "9999";
		String CONSUMER_BANKNAME = "9999";
		String CONSUMER_BANKCODE = "9999";

		//菲律宾
		String RSB_CHANNEL= "RSB";
		String BT_CHANNEL= "BT";
		String CEBU_CHANNEL= "CEBU";
		String MPF_CHANNEL= "MPF";
		String SB_CHANNEL= "SB";
		String DP_CHANNEL= "DP";
		String DGP_CHANNEL= "DGP";
		String SEC_CHANNEL= "SEC";

		//印尼
		String BSM_MANUAL_CHANNEL= "Manual";
		String BSM_CHANNEL= "BSM";
		String PMATA_CHANNEL= "PMATA";
		String CF_CHANNEL= "CF";
		String DK_CHANNEL= "DK";
	}

	public interface AbstractPaymentCallback{
		String INVESTMENT_CAllBACK_NAME = "investmentPaymentCallbackService";
		String DISBURSEMENT_CAllBACK_NAME = "disbursementPaymentCallbackService";
		String REPAYMENT_CAllBACK_NAME = "repaymentPaymentCallbackService";
	}

	
	//product
	public static final String PRODUCTTYPE = "POS Standard loan";

	//Full early repayment Switch
	public static final String FULLREPAY_SWITCH_OPEN = "1";

	//trade
	public interface TradeConstant{

		//RepaymentBatchRequest(菲律宾)
		String REPAYMENT_SUCCESSFUL_STATUS = "Successful";
		String REPAYMENT_FAILED_STATUS = "Failed";

		//DisburseBatchRequest(菲律宾)
		String DISBURSE_SUCCESSFUL_STATUS = "Successful";
		String DISBURSE_FAILED_STATUS = "Failed";

		//国家通用
		String IS_VERIFY_OTCCODE = "false";
		String UPLOADRCT_PRE_KEY = "uploadRct";

	}

	//Common
	public interface CommonConstant{
		//HelpCenters
		String COMMON_NATION = "Common";
	}
    // show loan status
    public interface LoanStatusConstant{
        String PROCESSING = "processing";
        String FAILED = "failed";
        String INDUE = "indue";
        String PAID = "paid";
        String CANCELED = "Cancelled";
        String OVERDUE = "overdue";
        String PUBLISHED = "published";
		String RECOMMENDED = "Alternative Offer";
		String DECLINED = "Declined";
		String APPROVED = "Waiting for Disbursement";
		String DISBURSEMENT_FAILED = "Disbursement Failed";
	}

    public interface PlatformType {
        String IOS = "ios";
        String ANDROID = "android";
    }

	public static final String SAPLATFORM = "sa-tablet-android";
	public static final String ALLPLATFORM = "All";

	//LoanProductExtensionConstant(国家通用)
	public interface LoanProductExtensionConstant{
		//提前全额还款，起始期数，名称
		String EFFECTIVE_START_M = "startM";
		//产品扩展表，type名称
		String PRODUCT_EXTENSION_TYPE_EFFECTIVEM = "EffectiveM";
		//设置一个999999999，用于提前全额还款的相关提醒，比如分期全部逾期，返回此值(非下发)
		Integer START_BOUND_M = 999999999;

	}

	//Repayment
	public interface Repayment{
		//afterSuccessCallback Plugin name
		String ACCOUNTTAG = "tag";
		String REWARDS = "rewards";
		String MAIL = "mail";
		String SMS = "sms";
		String PUSH = "push";
		String RMQ = "RMQ";
		String REDEMPTION = "redemption";
		String AUTOREPAY = "autoRepay";
		String NOTIFICATION = "notification";

	}
	//Investment
	public interface Investment{
		//afterSuccessCallback Plugin name
		String INVESTMENT_DISBURSEMENT = "disbursement";
		String INVESTMENT_RMQ = "RMQ";

	}
	//Disbursement
	public interface Disbursement{
		//afterSuccessCallback Plugin name
		String DISBURSEMENT_RMQ = "RMQ";

	}

	//MQ TOPIC
	public interface MqTopic{
		//ECPay-proxy
		String ECPAY_PROXY_TOPIC = "PAYMENT_SRV";
		String PAYMENT_SRV_TAG = "PAY_RESULT";

		//Payment2.0: Payment-Srv
		String PAYMENT_SRV_TOPIC = "PAYMENT-SRV";
		String PAYMENT_SRV_PAYINSTTRANSIT_TAG = "PayInstTransit";

		//RepaymentReminder
		String REPAYMENT_REMINDER_TAG = "RepaymentReminder";

	}

}
