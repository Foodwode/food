package com.example.utils;

/**
 * Create by Gary
 * 2018-12-18
 */
public class MessageAssemble {
    /**
     * 商户代码
     */
    public static final String BUSINESS_CODE="12111151_";
    public static final String REQU_FILE_NAME="RequfileName";
    public static final String RESULT_FILE_NAME="ResultFileName";
    /**
     * 子账户批量开户文件命名开头
     */
    public static final String BATCH_OPEN_ZIP="BATCH_OPEN_";
    /**
     * 批量支付文件命名开头
     */
    public static final String BATCH_PAY="BATCH_PAY_";
    /**
     * 批量流水号
     */
    public static final String BATCH_CODE ="BatchCode";
    /**
     * PDS系统返回商户回执文件开头
     */
    public static final String  PDS_OPEN_RESULT="OPEN_RESULT_";
    /**
     * 本地文件存储路径
     */
    public static final String   LOCAL_URL="e:test/";
    public static final String DAT=".DAT";
    public static final String ZIP=".zip";
    /**
     * 交易会员名称
     */
    //TODO 等待正式名称
    public static final String TRADE_MEMBER_NAME = "TradeMemBerName";
    /**
     * 币种
     */
    public static final String CURRENCY = "Currency";
    /**
     * 子帐号
     */
    public static final String SUB_ACC = "SubAcc";
    /**
     * 摊位号
     */
    public static final String BOOTH_NO = "BoothNo";
    /**
     * 交易会员级别
     */
    public static final String TRADE_MEM_BER_GRADE = "TradeMemBerGrade";
    /**
     * 交易会员性质
     */
    public static final String TRADE_MEMBER_PROPERTY = "TradeMemberProperty";
    /**
     * 证件类型
     */
    public static final String PAPERS_TYPE = "PapersType";
    /**
     * 证件类型
     */
    public static final String PAPERS_TYPE_01 = "PapersType";
    /**
     * 证件代码
     */
    public static final String PAPERS_CODE = "PapersCode";
    /**
     * 是否需要短信通知
     */
    public static final String IS_MESSAGER = "IsMessager";
    /**
     * Email
     */
    public static final String Email = "Email";
    /**
     * 交易流水号
     */
    public static final String TRANS_CODE_ID = "TransCodeId";
    /**
     * 交易码
     */
    public static final String TRANS_CODE = "TransCode";
    /**
     * 账号
     */
    public static final String ACCOUNT ="Account";
    /**
     * 账户类别
     * 1：子账户
     2：实体账户
     3：资金监管账户
     */
    public static final String ACCOUNT_TYPE="AccountType";
    /**
     * 账户名称
     */
    public static final String ACCOUNT_NAME="AccountName";
    /**
     *子账户余额
     */
    public static final String SUB_ACCOUNT_MONEY="SubAccountMoney";
    /**
     *冻结金额
     */
    public static final String FREEZE_MONEY="FreezeMoney";
    /**
     * 请求报文的标签
     */
    public static final String CPMB2B = "CPMB2B";
    public static final String MESSAGE_DATA = "MessageData";
    public static final String BASE = "Base";
    public static final String VERSION = "Version";
    public static final String SIGNFLAG = "SignFlag";
    public static final String SEVER_MODEL = "SeverModel";
    public static final String RES_HEADER = "ResHeader";
    public static final String STATUS = "Status";
    public static final String CODE = "Code";
    public static final String MESSAGE = "Message";
    public static final String DATABODY = "DataBody";
    /**
     * 当账户类别为1、2时，交易会员必须填
     */
    public static final String MEM_BER_CODE = "MemBerCode";
    public static final String REMARK1 = "Remark1";
    public static final String REMARK2 = "Remark2";
    public static final String REMARK3 = "Remark3";
    public static final String REMARK4 = "Remark4";
    public static final String REMARK5 = "Remark5";
    public static final String CLIENT_TIME = "ClientTime";
    public static final String MERCHANT_NO = "MerchantNo";
    public static final String OPER_TYPE = "OperType";
    public static final String SUB_ACCOUNT = "SubAccount";
    public static final String TRADE_MEM_CODE = "TradeMemCode";
    public static final String LINK_ACCOUNT_TYPE = "LinkAccountType";
    public static final String IS_OTHER = "IsOther";
    public static final String ACCOUNT_SIGN = "AccountSign";
    public static final String IS_OTHER_BANK = "IsOtherBank";
    public static final String SETTLE_ACCOUNT_NAME = "SettleAccountName";
    public static final String SETTLE_ACCOUNT = "SettleAccount";
    public static final String IS_SECOND_ACC = "IsSecondAcc";
    public static final String PAY_BANK = "PayBank";
    public static final String BANK_NAME = "BankName";
    public static final String STRIDE_VALIDATE = "StrideValidate";
    public static final String CURR_CODE = "CurrCode";
    public static final String GRADE_CODE = "GradeCode";
    public static final String CONTACT = "Contact";
    public static final String CONTACT_PHONE = "ContactPhone";
    public static final String PHONE = "Phone";
    public static final String CONTACT_ADDR = "ContactAddr";
    public static final String BUSINESS_NAME = "BusinessName";
    public static final String MESSAGE_PHONE = "MessagePhone";
    public static final String COMMERCIAL_END_DAY = "CommercialEndDay";
    public static final String COMPANY_PROPERTY = "CompanyProperty";
    public static final String CREAD_SCOPE = "CreadScope";
    public static final String BUSINES_LICENCE = "BusinesLicence";
    public static final String COMMERCIAL_ADDR = "CommercialAddr";
    public static final String CHINA_CODE = "ChinaCode";
    public static final String COMMERCIAL_URL = "CommercialUrl";
    public static final String LEGAL_BUSINESS_NAME = "LegalBusinessName";
    public static final String LEGAL_PAPERS_TYPE = "LegalPapersType";
    public static final String LEGAL_PAPERS_CODE = "LegalPapersCode";
    public static final String FAX_CODE = "FaxCode";
    public static final String EMAIL_ADDR = "EmailAddr";
    public static final String BUSINESS_IP = "BusinessIp";
    public static final String STATE = "State";
    public static final String INTER_URL = "InterUrl";
    public static final String CUS_MANAGER_CODE = "CusManagerCode";
    public static final String CUS_MANAGER_AREA = "CusManagerArea";
    public static final String CUS_MANAGER_NAME = "CusManagerName";
    public static final String IS_MESSAGER_SEVER = "IsMessagerSever";
    public static final String TRADE_MESSAGER_PHONE = "TradeMessagerPhone";
    public static final String IS_STOP_OUT_MONEY = "IsStopOutMoney";
    public static final String IS_STOP_IN_MONEY = "IsStopInMoney";
    public static final String IS_MONEY_MODIFY_STATE = "IsMoneyModifyState";
    public static final String LINK_WAY = "LinkWay";
    public static final String SETTLE_ACCOUNT_RATIO = "SettleAccountRatio";
    public static final String SETTLE_MEMO_RATIO = "SettleMemoRatio";
    public static final String IN_OUT_OUATH_SIGN = "InOutOuathSign";
    public static final String OUT_COME_ACCOUNT = "OutComeAccount";
    public static final String OUT_COME_ACCOUNT_NAME = "OutComeAccountName";
    public static final String OUT_COME_ACCOUNT_BANK = "OutComeAccountBank";
    public static final String OUT_COME_ACCOUNT_ID_TYPE = "OutComeAccountIDType";
    public static final String OUT_COME_ACCOUNT_ID_CODE = "OutComeAccountIDCode";
    public static final String END_DAY = "EndDay";
    public static final String OUT_COME_ACCOUNT_TYPE = "OutComeAccountType";
    public static final String PAY_CODE = "PayCode";
    public static final String PAY_STATE = "PayState";
    public static final String CHANNEL_NO = "ChannelNo";
    public static final String OUT_COME_MONEY = "OutComeMoney";
    public static final String SUM_SUB_MONEY = "SumSubMoney";
    public static final String OTHER_BANK_COST = "OtherBankCost";
    public static final String CUS_PAY_MONEY = "CusPayMoney";
    public static final String MER_OTHER_PAY_MONEY = "MerOtherPayMoney";
    public static final String OUT_ACCOUNT = "OutAccount";
    public static final String OUT_ACCOUNT_NAME = "OutAccountName";
    public static final String TRADE_ABSTRACT = "TradeAbstract";
    public static final String IN_OUT_MONEY_TYPE = "InOutMoneyType";
    public static final String CRE_MONEY = "CreMoney";
    public static final String ELE_FILE_NAME = "EleFileName";
    public static final String MIN_AMT = "MinAmt";
    public static final String MAX_AMT = "MaxAmt";
    public static final String TRADE_CURRENCY = "TradeCurrency";
    public static final String RECORD_NUM = "RecordNum";
    public static final String CYCLES = "Cycles";
    public static final String CYCLE = "Cycle";
    // 序号
    public static final String ORDER = "Order";
    // 变更日期
    public static final String MODIFY_DATE = "ModifyDate";
    // 授权完成时间
    public static final String OUATH_END_TIMES = "OuathEndTimes";
    // 绑定状态
    public static final String LINK_STATE = "LinkState";
    // 授权渠道
    public static final String OUATH_WAY = "OuathWay";


    public static final String PLATFORM = "huaxia";

    // 币种
    public static final String CURRENCY1 = "CNY";

    // 交易会员级别
    public static final String TRADE_MEM_BER_GRADE2 = "2";

    // 交易会员性质 企业
    public static final String TRADE_MEMBER_PROPERTY0 = "0";

    // 交易会员性质 个人
    public static final String TRADE_MEMBER_PROPERTY1 = "1";

    // 证件类型
    public static final String PAPERS_TYPE10 = "10";

    // 是否需要短信通知 1-需要 2-不需要
    public static final String IS_MESSAGER2 = "2";

    // Email
    public static final String EMAIL = "";
    /**
     * 执行状态
     */
    public static final String EXCUTE_STATE="ExcuteState";

    // 子账户绑定账户信息查询交易码
    public static final String TRANS_CODE1 = "101080";

    // 批量支付交易码
    public static final String TRANS_CODE2 = "102020";

    // 批量支付交易码
    public static final String TRANS_CODE3 = "103010";

    // 出入金手续费试算交易码
    public static final String TRANS_CODE4 = "103070";

    // 3.1.2.4.超级网银出金交易码
    public static final String TRANS_CODE5 = "103100";

    // 日切交易通知
    public static final String TRANS_CODE6 = "104010";

    // 子账户批量开户
    public static final  String SUBACCOUNT_BATCH_ACCOUNT_TRANCODE="101030";

    // 职多多回调路径
    public static final String ZDD_URL = "/jdjr/notify/huaxiaSalary";

}
