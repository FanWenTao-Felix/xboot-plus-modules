<template>
	<view class="content">
		<!-- header -->
		<view class="service-policy">
			<view class="item">
				<image class="red-point" src="/static/redPoint.png"></image>
				30天无忧退货
			</view>
			<view class="item">
				<image class="red-point" src="/static/redPoint.png"></image>
				48小时快速退款
			</view>
			<view class="item">
				<image class="red-point" src="/static/redPoint.png"></image>
				满88元免邮费
			</view>
		</view>
		<!-- 空 -->
		<view class="empty-cart">
			<view class="add">
				<image class="image" src="/static/emptyCart.png"></image>
				<text class="txt">去添加点什么吧</text>
			</view>
		</view>
		<!-- 未登录 -->
		<view class="login-wrap" v-if="!isLogin">
			<TButton type="danger" @click="toLogin" width="500rpx">登录</TButton>
		</view>
		<recommend v-if="isLogin"></recommend>
	</view>
</template>

<script>
import TButton from '@/components/libs/thor/button.vue';
import recommend from '@/components/recommend.vue';
export default {
	components: {
		recommend,
		TButton
	},
	data() {
		return {
			isLogin: false
		};
	},
	methods: {
		toLogin(){
			uni.navigateTo({
				url: "/pages/auth/login/login"
			})
		}
	}
};
</script>

<style>
@import './cart.css';
</style>
