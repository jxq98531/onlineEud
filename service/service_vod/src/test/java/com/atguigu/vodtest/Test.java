package com.atguigu.vodtest;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.vod.model.v20170321.GetPlayInfoRequest;
import com.aliyuncs.vod.model.v20170321.GetPlayInfoResponse;
import com.aliyuncs.vod.model.v20170321.GetVideoPlayAuthRequest;
import com.aliyuncs.vod.model.v20170321.GetVideoPlayAuthResponse;

import java.util.List;

/**
 * @program: guli_parent
 * @description
 * @author: 金晓强
 * @create: 2020-07-06 11:00
 **/
public class Test {
	public static void main(String[] args) throws Exception {
		DefaultAcsClient client = InitObject.initVodClient("LTAI4G9Adho2HYZYPj7z3p8M", "6BKMxogpZGeLkRhKxrLhOL4eQsacDw");

		GetVideoPlayAuthRequest request = new GetVideoPlayAuthRequest();
		GetVideoPlayAuthResponse response = new GetVideoPlayAuthResponse();

		request.setVideoId("32ca9448cfb3493b838b56017681e8a3");

		response = client.getAcsResponse(request);
		System.out.println("playAuth:"+response.getPlayAuth());
	}
}
