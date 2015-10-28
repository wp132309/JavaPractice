/**
 * 
 */
package org.dimigo.io;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

/**
 * <pre>
 * org.dimigo.io
 *     l_ SaveImageFromUrl
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 10. 26.
 * </pre>
 * 
 * @author		: 김종윤
 * @version	: 1.0
 */
public class SaveImageFromUrl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String imageUrl = "http://cfile3.uf.tistory.com/image/253C8349546E87A12FACD8";
		
		try {
			URL url = new URL(imageUrl);
			
			try(InputStream is = url.openStream();
					OutputStream os = new FileOutputStream("files/kakao.jpg")) {
				
				int result;
				byte[] buf = new byte[100];
				
				while((result = is.read(buf)) != -1) {
					os.write(buf, 0, result);
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
