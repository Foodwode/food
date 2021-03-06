package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 伪前置机
 *
 * @author zhaChengwei
 * @date 2019-01-24 14:00
 */
@RestController
@RequestMapping("/demo")
public class FakeMachine {

    @PostMapping("test")
    public String BatchAccount(String requestXml) {
        if ("101030".equals(requestXml)) {
            return "<?xml version=\"1.0\" encoding=\"GBK\"?>\n" +
                    "<CPMB2B>\n" +
                    "<MessageData>\n" +
                    "<Base>\n" +
                    "<Version>1.0</Version>\n" +
                    "<SignFlag>1</SignFlag>\n" +
                    "<SeverModel>3</SeverModel>\n" +
                    "</Base>\n" +
                    "<ResHeader>\n" +
                    "<TransCodeId>66f1eb31d530a727</TransCodeId>\n" +
                    "<TransCode>101030</TransCode>\n" +
                    "<Status>\n" +
                    "<Code>000000</Code>\n" +
                    "<Message>交易成功</Message>\n" +
                    "</Status>\n" +
                    "</ResHeader>\n" +
                    "<DataBody><ResultFileName>OPEN_RESULT_12111151_20180316173721_01.DAT.zip</ResultFileName>\n" +
                    "<Remark1></Remark1>\n" +
                    "<Remark2></Remark2>\n" +
                    "</DataBody>\n" +
                    "</MessageData>\n" +
                    "</CPMB2B>";
        }
        if ("101070".equals(requestXml)) {
            return "<?xml version=\"1.0\" encoding=\"GBK\"?>\n" +
                    "<CPMB2B>\n" +
                    "<MessageData>\n" +
                    "<Base>\n" +
                    "<Version>1.0</Version>\n" +
                    "<SignFlag>1</SignFlag>\n" +
                    "<SeverModel>3</SeverModel>\n" +
                    "</Base>\n" +
                    "<ResHeader>\n" +
                    "<TransCodeId>201801311022421010705568</TransCodeId>\n" +
                    "<TransCode>101070</TransCode>\n" +
                    "<Status>\n" +
                    "<Code>BPI451</Code>\n" +
                    "<Message>绑定跨行账户无需验证跨行信息</Message>\n" +
                    "</Status>\n" +
                    "</ResHeader>\n" +
                    "<DataBody>\n" +
                    "<MemBerCode></MemBerCode>\n" +
                    "<Remark1></Remark1>\n" +
                    "<Remark2></Remark2>\n" +
                    "</DataBody>\n" +
                    "</MessageData>\n" +
                    "</CPMB2B>";
        }
        if ("101080".equals(requestXml)) {
            return "<?xml version=\"1.0\" encoding=\"GBK\"?>\n" +
                    "<CPMB2B>\n" +
                    "<MessageData>\n" +
                    "<Base>\n" +
                    "<Version>1.0</Version>\n" +
                    "<SignFlag>1</SignFlag>\n" +
                    "<SeverModel>3</SeverModel>\n" +
                    "</Base>\n" +
                    "<ResHeader>\n" +
                    "<TransCodeId>201803151056211010804902</TransCodeId>\n" +
                    "<TransCode>101080</TransCode>\n" +
                    "<Status>\n" +
                    "<Code>000000</Code>\n" +
                    "<Message>交易成功</Message>\n" +
                    "</Status>\n" +
                    "</ResHeader>\n" +
                    "<DataBody>\n" +
                    "<Count>1</Count>\n" +
                    "<Cycles>\n" +
                    "<Cycle>\n" +
                    "<Order>1</Order>\n" +
                    "<SubAccount>20020180315395534</SubAccount>\n" +
                    "<TradeMemCode>0000001990</TradeMemCode>\n" +
                    "<MerchantNo>12111271</MerchantNo>\n" +
                    "<OutComeAccountType>0</OutComeAccountType>\n" +
                    "<IsOther>2</IsOther>\n" +
                    "<AccountSign>0</AccountSign>\n" +
                    "<IsOtherBank>1</IsOtherBank>\n" +
                    "<SettleAccountName>徐明华</SettleAccountName>\n" +
                    "<SettleAccount>3217001140038402639</SettleAccount>\n" +
                    "<PayBank>105100000017</PayBank>\n" +
                    "<BankName>中国建设银行股份有限公司总行</BankName>\n" +
                    "<ModifyDate>20180315</ModifyDate>\n" +
                    "<OuathEndTimes></OuathEndTimes>\n" +
                    "<LinkState>0</LinkState>\n" +
                    "<OuathWay></OuathWay>\n" +
                    "<Remark1></Remark1>\n" +
                    "<Remark2></Remark2>\n" +
                    "</Cycle>\n" +
                    "</Cycles>\n" +
                    "<Remark1></Remark1>\n" +
                    "<Remark2></Remark2>\n" +
                    "<Remark3></Remark3>\n" +
                    "<Remark4></Remark4>\n" +
                    "<Remark5></Remark5>\n" +
                    "</DataBody>\n" +
                    "</MessageData>\n" +
                    "</CPMB2B>";
        }
        //批量支付
        if ("102020".equals(requestXml)) {
            return "<?xml version=\"1.0\" encoding=\"GBK\"?>\n" +
                    "<CPMB2B>\n" +
                    "<MessageData>\n" +
                    "<Base>\n" +
                    "<Version>1.0</Version>\n" +
                    "<SignFlag>1</SignFlag>\n" +
                    "<SeverModel>3</SeverModel>\n" +
                    "</Base>\n" +
                    "<ResHeader>\n" +
                    "<TransCodeId> d749af489380183e </TransCodeId>\n" +
                    "<TransCode>102020</TransCode>\n" +
                    "<Status>\n" +
                    "<Code>000000</Code>\n" +
                    "<Message>批量支付执行完,请查询回执文件</Message>\n" +
                    "</Status>\n" +
                    "</ResHeader>\n" +
                    "<DataBody>\n" +
                    "<ResultFileName>PAY_RESULT_12111151_20180202103425_01.DAT</ResultFileName>\n" +
                    "<Remark1></Remark1>\n" +
                    "<Remark2></Remark2>\n" +
                    "</DataBody>\n" +
                    "</MessageData>\n" +
                    "</CPMB2B>";
        }
        //103070 跨行出入金手续费试算
        if ("103070".equals(requestXml)) {
            return "<?xml version=\"1.0\" encoding=\"GBK\"?>\n" +
                    "<CPMB2B>\n" +
                    "<MessageData>\n" +
                    "<Base>\n" +
                    "<Version>1.0</Version>\n" +
                    "<SignFlag>0</SignFlag>\n" +
                    "<SeverModel>3</SeverModel>\n" +
                    "</Base>\n" +
                    "<ResHeader>\n" +
                    "<TransCodeId>201801311602301030702158</TransCodeId>\n" +
                    "<TransCode>103070</TransCode>\n" +
                    "<Status>\n" +
                    "<Code>000000</Code>\n" +
                    "<Message>交易成功</Message>\n" +
                    "</Status>\n" +
                    "</ResHeader>\n" +
                    "<DataBody>\n" +
                    "<CreMoney>1000</CreMoney>\n" +
                    "<OtherBankCost>10000</OtherBankCost>\n" +
                    "<CusPayMoney>10000</CusPayMoney>\n" +
                    "<MerOtherPayMoney>0</MerOtherPayMoney>\n" +
                    "<SubAccountMoney>182000</SubAccountMoney>\n" +
                    "<FreezeMoney>0</FreezeMoney>\n" +
                    "<Remark1></Remark1>\n" +
                    "<Remark2></Remark2>\n" +
                    "<Remark3></Remark3>\n" +
                    "<Remark4></Remark4>\n" +
                    "<Remark5></Remark5>\n" +
                    "</DataBody>\n" +
                    "</MessageData>\n" +
                    "</CPMB2B>";
        }
        //103100 超级网银系统出金
        if ("103100".equals(requestXml)) {
            return "<?xml version=\"1.0\" encoding=\"GBK\"?>\n" +
                    "<CPMB2B>\n" +
                    "<MessageData>\n" +
                    "<Base>\n" +
                    "<Version>1.0</Version>\n" +
                    "<SignFlag>0</SignFlag>\n" +
                    "<SeverModel>3</SeverModel>\n" +
                    "</Base>\n" +
                    "<ResHeader>\n" +
                    "<TransCodeId>201801311610541031004061</TransCodeId>\n" +
                    "<TransCode>103100</TransCode>\n" +
                    "<Status>\n" +
                    "<Code>BAG004</Code>\n" +
                    "<Message>业务已受理,请稍后查询</Message>\n" +
                    "</Status>\n" +
                    "</ResHeader>\n" +
                    "<DataBody>\n" +
                    "<PayCode>2018013116105454810</PayCode>\n" +
                    "<SubAccountMoney>177000</SubAccountMoney>\n" +
                    "<FreezeMoney>0</FreezeMoney>\n" +
                    "<Remark1></Remark1>\n" +
                    "<Remark2></Remark2>\n" +
                    "<Remark3></Remark3>\n" +
                    "<Remark4></Remark4>\n" +
                    "<Remark5></Remark5>\n" +
                    "</DataBody>\n" +
                    "</MessageData>\n" +
                    "</CPMB2B>";
        }
        //104040 支付单状态查询
        if ("104040".equals(requestXml)) {
            return "<?xml version=\"1.0\" encoding=\"GBK\"?>\n" +
                    "<CPMB2B>\n" +
                    "<MessageData>\n" +
                    "<Base>\n" +
                    "<Version>1.0</Version>\n" +
                    "<SignFlag>0</SignFlag>\n" +
                    "<SeverModel>3</SeverModel>\n" +
                    "</Base>\n" +
                    "<ResHeader>\n" +
                    "<TransCodeId>201801311520421040401013</TransCodeId>\n" +
                    "<TransCode>104040</TransCode>\n" +
                    "<Status>\n" +
                    "<Code>000000</Code>\n" +
                    "<Message>交易成功</Message>\n" +
                    "</Status>\n" +
                    "</ResHeader>\n" +
                    "<DataBody>\n" +
                    "<PayCode>20180104000001</PayCode>\n" +
                    "<PayState>1</PayState>\n" +
                    "<Remark1>null</Remark1>\n" +
                    "<Remark2>null</Remark2>\n" +
                    "</DataBody>\n" +
                    "</MessageData>\n" +
                    "</CPMB2B>";
        }
        //104050 电子回单打印
        if ("104050".equals(requestXml)) {
            return "<?xml version=\"1.0\" encoding=\"GBK\"?>\n" +
                    "<CPMB2B>\n" +
                    "<MessageData>\n" +
                    "<Base>\n" +
                    "<Version>1.0</Version>\n" +
                    "<SignFlag>0</SignFlag>\n" +
                    "<SeverModel>3</SeverModel>\n" +
                    "</Base>\n" +
                    "<ResHeader>\n" +
                    "<TransCodeId>20180131165731</TransCodeId>\n" +
                    "<TransCode>104050</TransCode>\n" +
                    "<Status>\n" +
                    "<Code>000000</Code>\n" +
                    "<Message>交易成功</Message>\n" +
                    "</Status>\n" +
                    "</ResHeader>\n" +
                    "<DataBody>\n" +
                    "<EleFileName>ELECTRON_RECEIPT_20180104000006.pdf</EleFileName>\n" +
                    "<Remark1></Remark1>\n" +
                    "<Remark2></Remark2>\n" +
                    "</DataBody>\n" +
                    "</MessageData>\n" +
                    "</CPMB2B>";
        }
        //104010 日切交易通知
        if ("104010".equals(requestXml)) {
            return "<?xml version=\"1.0\" encoding=\"GBK\"?>\n" +
                    "<CPMB2B>\n" +
                    "<MessageData>\n" +
                    "<Base>\n" +
                    "<Version>1.0</Version>\n" +
                    "<SignFlag>1</SignFlag>\n" +
                    "<SeverModel>3</SeverModel>\n" +
                    "</Base>\n" +
                    "<ResHeader>\n" +
                    "<TransCodeId>015fedc9d570a2e8</TransCodeId>\n" +
                    "<TransCode>104010</TransCode>\n" +
                    "<Status>\n" +
                    "<Code>000000</Code>\n" +
                    "<Message>交易成功</Message>\n" +
                    "</Status>\n" +
                    "</ResHeader>\n" +
                    "<DataBody>\n" +
                    "<EndDay>20180129</EndDay>\n" +
                    "<Remark1></Remark1>\n" +
                    "<Remark2></Remark2>\n" +
                    "</DataBody>\n" +
                    "</MessageData>\n" +
                    "</CPMB2B>";
        }
        //104100 存管户当日交易明细查询
        if ("104100".equals(requestXml)) {
            return "<?xml version=\"1.0\" encoding=\"gbk\"?>\n" +
                    "\n" +
                    "<CPMB2B>\n" +
                    "  <MessageData>\n" +
                    "    <Base>\n" +
                    "      <Version>1.0</Version>\n" +
                    "      <SignFlag>1</SignFlag>\n" +
                    "      <SeverModel>3</SeverModel>\n" +
                    "    </Base>\n" +
                    "    <ResHeader>\n" +
                    "      <TransCodeId>20290920085510</TransCodeId>\n" +
                    "      <TransCode>104100</TransCode>\n" +
                    "      <Status>\n" +
                    "        <Code>000000</Code>\n" +
                    "        <Message>交易成功</Message>\n" +
                    "      </Status>\n" +
                    "    </ResHeader>\n" +
                    "    <DataBody>\n" +
                    "      <ResultFileName>BANKACC_DETAIL_12111151_20290919.DAT.zip</ResultFileName>\n" +
                    "<RecordNum>1</RecordNum>\n" +
                    "      <Remark1/>\n" +
                    "      <Remark2/>\n" +
                    "    </DataBody>\n" +
                    "  </MessageData>\n" +
                    "  <SignData>\n" +
                    "    <Signature>_Signature_</Signature>\n" +
                    "    <Signature-Algorithm>Signature_Algorithm</Signature-Algorithm>\n" +
                    "    <BankCertificate>_BankCertificate_</BankCertificate>\n" +
                    "  </SignData>\n" +
                    "</CPMB2B>";
        }
        //批量支付结果查询
        if ("102030".equals(requestXml)) {
            return "<?xml version=\"1.0\" encoding=\"GBK\"?>\n" +
                    "<CPMB2B>\n" +
                    "<MessageData>\n" +
                    "<Base>\n" +
                    "<Version>1.1</Version>\n" +
                    "<SignFlag>1</SignFlag>\n" +
                    "<SeverModel>3</SeverModel>\n" +
                    "</Base>\n" +
                    "<ResHeader>\n" +
                    "<TransCodeId>d8623bb19b23714c</TransCodeId>\n" +
                    "<TransCode>102030</TransCode>\n" +
                    "<Status>\n" +
                    "<Code>BPI248</Code>\n" +
                    "<Message>此任务未执行或批量流水号错误</Message>\n" +
                    "</Status>\n" +
                    "</ResHeader>\n" +
                    "<DataBody>\n" +
                    "<ExcuteState></ExcuteState>\n" +
                    "<ResultFileName></ResultFileName>\n" +
                    "<Remark1></Remark1>\n" +
                    "<Remark2></Remark2>\n" +
                    "</DataBody>\n" +
                    "</MessageData>\n" +
                    "</CPMB2B>";
        }
        return null;
    }

}
