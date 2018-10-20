package com.jk.util;

public class AlipayConfig {


    public static String app_id="2016092100563356";
    /*
           商户私钥
     */
    public static String merchant_private_key="MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQChGzhckRdO1KHIRPetS+PvycCjmwLxbgEcV911Ohi3IGSNJYGzqm8GZkPP19QMDK32ASuw91ecJi+NcTSki4mNDHKl2jiE0Z2J+uj2NJxphCqe9SyQR4QwLgkuPH0WWny3wzrIt87dObfBZX2fazpk439hiCrJ2PofvyPnod7PtpCZvOaTKJmXAe9UNMJdPbb12Ffv8XRU8Ymr4vDlHOoqE4JKnnbQYcGtcQy+XGAvcJWAUAlVMEdDGS9/dW0OGoTuuury7HdK7p3HGQIy1oC56ORNbr+/qMXmJREnoQQLWlPF2/rMwaNbGanU4UJtPoj/rqdzH60bCsUnZwbr8iCvAgMBAAECggEAfzvuITz9OWa4dl/xc02SMJgXqZ4MjvufqPDDl4dQaaANiWNrsacSk+1D9OuxLer9oGGATfyplkqaF4ymVKVW9qw0B0P2iv64+nXMclVOig61UmCy1yeEAED7QybGa1b/VGm9DTQNDa49r2El+zdGINOCkFZn5I2VzGi6RH8UZtm3PW2YTcUkKW19ll/z0jK8YAVNU6aVxpRO8zCbJzxqixgOYJ7o0KLe/DicKgxxHBSx60kA9ZC2Gxw/doDXmFW5MrKj++C8ipX5Pyrxar7YZwOOHW4TMYdmHO5DXwRTUvM4IMA17AhZe2EnHoMgJpjzOtkDEc5bDdKW7pyZiDyBwQKBgQDjSdGAHgtMiNLvj4rNhdSLfy486O5R0PGsDys0iwgdIqBebc1CXlGCuKKh26EtUmKd2TMcJXkhrk7stskWsUAjMfgeBnoNxZUAingqwMsYzQ8sCHd8IIbKmA0tUOmEV05GKS2pGqN1/3R379T9aVKDHd40Zcw5s6pkDGweZjvx8QKBgQC1dStdTOpTriv1CS3yasgr6jJsViPrnjuvosEP+KpDWh2nhjbwXqgSuQ86sApo3MTGa2EfP3mtqLiZuP4Yh9uXSBzvS+IaU86y8c2Fjzmn+lLnSDgu+oOM09Lwn319Rf5oEP3b4OqfGYhbUKJZwreTT83oVG8TT2jS0fBA8cicnwKBgQCp38Q7MzlSrHirH+eoEDx5Pkb6s0Vb1QSrinLKRJd93yFpMjvVPNVDFGhI/PQMAaU/QNTYVpGgQL0wYrUMxtGe/HvrRP/4RxJEYznJCmtBUBHk4TcciNr1lItUsUK27OHNwn0kBIrjaFhOQ+w2sn8/DBXFp8fp4ISbXkV4uwRWoQKBgDwV2U8iufENmmagLIO6EiBgg2PWPjy1/6OP7Afi2lZFD866JZUAcv0IJF/VjQzeFZZyVg2n0h3L4ZydYh4zVmZIrbQbV3pKSAZ/BQP1wiy6Oht1kY0UzNykA5RD66TAuZYyEi1t06LtLHa4Q5ofXPQ9l7wXwVQOlnJArCKFLV2XAoGAW+Ip6iYYZO47dNUyH7eVVQTDCadw7wDNq6/uuDMVOZWsvPewCmUjvL7LopsxOebnNZTqhPAASAhzlaWrMOplJ6Z01IWnfscyM1HMgnQOjWhHs6yUWDiU3u6Qt3BQgtHJkARngLir6BhT39Fpn1m5L6vf00+T27a0FmJPFRVIhXA=";
    /*
     支付宝公钥
     */
    public static String alipay_public_key="MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAoRs4XJEXTtShyET3rUvj78nAo5sC8W4BHFfddToYtyBkjSWBs6pvBmZDz9fUDAyt9gErsPdXnCYvjXE0pIuJjQxypdo4hNGdifro9jScaYQqnvUskEeEMC4JLjx9Flp8t8M6yLfO3Tm3wWV9n2s6ZON/YYgqydj6H78j56Hez7aQmbzmkyiZlwHvVDTCXT229dhX7/F0VPGJq+Lw5RzqKhOCSp520GHBrXEMvlxgL3CVgFAJVTBHQxkvf3VtDhqE7rrq8ux3Su6dxxkCMtaAuejkTW6/v6jF5iURJ6EEC1pTxdv6zMGjWxmp1OFCbT6I/66ncx+tGwrFJ2cG6/IgrwIDAQAB";
    /*
    签名方式
     */
    public static String sign_type="RSA2";
    /*
     字符编码格式
     */
    public static String charset="utf-8";
    /*
    支付网关
     */
    public static String gatewayUrl="https://openapi.alipaydev.com/gateway.do";
    /*
   成功页面
    */
    public static String return_url="http://192.168.31.148:8066/main";
    /*
    日志存储
     */
    public static String log_path="c:\\";

}
