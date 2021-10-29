package com.sun.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Security;

import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SM3Digest;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

public class BCDigestUtil {

	static {
		try {
			// 静态注册包
			Security.addProvider(new BouncyCastleProvider());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * ********************************
	 *
	 * @Title: digestSM3
	 * @Description: 生成sm3摘要算法
	 * @param input
	 *            摘要原文
	 * @return 生成得摘要值
	 * @author lhj
	 * @date 2020年1月2日 上午9:52:07
	 *********************************
	 */
	public static byte[] digestSM3(byte[] input) {
		Digest md = new SM3Digest();
		md.update(input, 0, input.length);
		byte[] digest = new byte[md.getDigestSize()];
		md.doFinal(digest, 0);
		for(byte by: digest){
			System.out.print(by+",");
		}
		return digest;
	}

	/**
	 * ********************************
	 *
	 * @Title: digestSM3
	 * @Description: 生成sm3摘要算法
	 * @param inputStr
	 *            字符串原文
	 * @return 16进制得摘要值
	 * @author lhj
	 * @date 2020年1月2日 上午9:59:16
	 *********************************
	 */
//	public static String digestSM3(String inputStr) {
//		byte[] input = inputStr.getBytes();
//		byte[] digest = digestSM3(input);
//		String digestHex = StringUtil.bytesToHex(digest);
//		return digestHex;
//	}

	/**
	 * ********************************
	 *
	 * @Title: digestSHA1
	 * @Description: 获取SHA-1摘要值
	 * @param input
	 *            原文
	 * @return 摘要值
	 * @author lhj
	 * @date 2019年12月25日 下午4:05:28
	 *********************************
	 */
//	public static String digestSHA1(String input) {
//
//		String hashAlgorithm = "SHA-1";
//		try {
//			byte[] dig = digest(hashAlgorithm, input.getBytes());
//			return StringUtil.bytesToHex(dig);
//		} catch (NoSuchAlgorithmException e) {
//			e.printStackTrace();
//			return null;
//		}
//
//	}

	/**
	 * ********************************
	 *
	 * @Title: digest
	 * @Description: 获取摘要
	 * @param hashAlgorithm
	 *            摘要算法：SHA-1，MD5，SHA-256，RipeMD160
	 * @param input
	 *            原文
	 * @return
	 * @throws NoSuchAlgorithmException
	 *             不支持该算法异常
	 * @throws @author
	 *             lhj
	 * @date 2019年12月25日 下午3:53:57
	 *********************************
	 */
	public static byte[] digest(String hashAlgorithm, byte[] input) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance(hashAlgorithm);

		md.update(input);
		return md.digest();
	}
}
