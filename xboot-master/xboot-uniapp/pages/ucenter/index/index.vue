<template>
	<view class="content">
		<view class="user-section">
			<!-- <image class="bg" src="/static/meBg.png"></image> -->
			<view class="bg black"></view>
			<view class="user-info-box">
				<image class="avatar" :src="userInfo.portrait || '/static/avatar.png'"></image>
				<view class="info-box">
					<text class="username">{{ userInfo.nickname || 'Hi，游客' }}</text>
				</view>
			</view>
			<view class="vip-wrap" @click="toVip">
				<view class="vip-card-box">
					<view class="vip-title-wrap">
						<image class="vip-icon" src="/static/vip2.png"></image>
						<view class="vip-title" style="margin-left: 15rpx;">超级会员</view>
						<text class="vip-title" style="margin: 0 15rpx;">|</text>
						<swiper vertical autoplay circular interval="3000" class="tui-swiper">
							<swiper-item v-for="(item, i) in vipList" :key="i" class="tui-swiper-item">
								<view class="vip-title">{{ item }}</view>
							</swiper-item>
						</swiper>
						<view class="b-btn">立即开通</view>
					</view>
				</view>
			</view>
		</view>

		<view class="order-wrap">
			<view class="order-header">
				<text class="txt">我的订单</text>
				<view class="right" @click="toOrder(0)">
					<text class="all">查看全部</text>
					<Icon name="arrowright" :size="18"></Icon>
				</view>
			</view>
			<view class="order-icon">
				<view class="icon-wrap" @click="toOrder(1)">
					<badge :count="order.pay"><image class="icon" src="/static/pay.png"></image></badge>
					<text class="txt">待付款</text>
				</view>
				<view class="icon-wrap" @click="toOrder(2)">
					<badge :count="order.toSend"><image class="icon" src="/static/toSend.png"></image></badge>
					<text class="txt">待发货</text>
				</view>
				<view class="icon-wrap" @click="toOrder(3)">
					<badge :count="order.send"><image class="icon" src="/static/send.png"></image></badge>
					<text class="txt">已发货</text>
				</view>
				<view class="icon-wrap" @click="toOrder(4)">
					<badge :count="order.comment"><image class="icon" src="/static/comment.png"></image></badge>
					<text class="txt">待评价</text>
				</view>
				<view class="icon-wrap">
					<badge :count="order.afterSale"><image class="icon" src="/static/afterSale.png"></image></badge>
					<text class="txt">退换/售后</text>
				</view>
			</view>
		</view>

		<view class="order-wrap">
			<view class="order-header"><text class="txt">我的资产</text></view>
			<view class="order-icon">
				<view class="icon-wrap" @click="toCoupon">
					<text class="num">{{ wallet.coupon }}</text>
					<text class="txt">优惠券</text>
				</view>
				<view class="icon-wrap">
					<text class="num">{{ wallet.point }}</text>
					<text class="txt">积分</text>
				</view>
				<view class="icon-wrap" @click="toRed">
					<text class="num">{{ wallet.red }}</text>
					<text class="txt">红包</text>
				</view>
				<view class="icon-wrap">
					<text class="num">{{ wallet.allowance }}</text>
					<text class="txt">津贴</text>
				</view>
				<view class="icon-wrap">
					<text class="num">{{ wallet.gift }}</text>
					<text class="txt">礼品卡</text>
				</view>
			</view>
		</view>

		<view class="service-wrap">
			<view class="order-header"><text class="txt">我的服务</text></view>
			<view class="order-icon">
				<view class="icon-wrap">
					<image class="icon" src="/static/group.png"></image>
					<text class="txt">拼团订单</text>
				</view>
				<view class="icon-wrap">
					<image class="icon" src="/static/coupon.png"></image>
					<text class="txt">领劵中心</text>
				</view>
				<view class="icon-wrap">
					<image class="icon" src="/static/sign.png"></image>
					<text class="txt">签到领钱</text>
				</view>
				<view class="icon-wrap" @click="toAddress">
					<image class="icon" src="/static/address.png"></image>
					<text class="txt">地址管理</text>
				</view>
			</view>
			<view class="order-icon">
				<view class="icon-wrap" @click="toContact">
					<image class="icon" src="/static/service.png"></image>
					<text class="txt">联系客服</text>
				</view>
				<view class="icon-wrap">
					<image class="icon" src="/static/help.png"></image>
					<text class="txt">帮助中心</text>
				</view>
				<view class="icon-wrap">
					<image class="icon" src="/static/feedback.png"></image>
					<text class="txt">用户反馈</text>
				</view>
				<view class="icon-wrap" @click="toSetting">
					<image class="icon" src="/static/setting.png"></image>
					<text class="txt">设置</text>
				</view>
			</view>
		</view>
		<recommend v-if="true"></recommend>
	</view>
</template>

<script>
import Icon from '@/components/libs/thor/icon.vue';
import badge from '@/components/libs/iview/badge.vue';
import recommend from '@/components/recommend.vue';
export default {
	components: {
		badge,
		Icon,
		recommend
	},
	data() {
		return {
			userInfo: {},
			vipList: ['先用1年，再付卡费', 'Pro会员享9大权益', '每月0元，拿走一件商品'],
			isLogin: false,
			order: {
				pay: 1,
				toSend: 0,
				send: 0,
				comment: 0,
				afterSale: 0
			},
			wallet: {
				coupon: 2,
				point: 0,
				red: 3,
				allowance: 0,
				gift: 0
			}
		};
	},
	methods: {
		toLogin() {
			if (!this.isLogin) {
				uni.navigateTo({
					url: '/pages/auth/tologin/tologin'
				});
			}
		},
		checkLogin() {
			if (!this.isLogin) {
				uni.navigateTo({
					url: '/pages/auth/tologin/tologin'
				});
			}
		},
		toOrder(e) {
			this.checkLogin();
			let type = e.currentTarget.id;
			uni.navigateTo({
				url: '/pages/ucenter/order/order?type=' + type
			});
		},
		toAddress() {
			this.checkLogin();
			uni.navigateTo({
				url: '/pages/ucenter/address/index/index'
			});
		},
		toCoupon() {
			this.checkLogin();
			uni.navigateTo({
				url: '/pages/ucenter/coupon/coupon'
			});
		},
		toRed() {
			this.checkLogin();
			uni.navigateTo({
				url: '/pages/ucenter/red/red'
			});
		},
		toSetting() {
			uni.navigateTo({
				url: '/pages/ucenter/setting/setting'
			});
		},
		toContact() {
			uni.makePhoneCall({
				phoneNumber: '10086'
			});
		},
		toVip() {
			uni.navigateTo({
				url: '/pages/ucenter/vip/vip'
			});
		}
	}
};
</script>

<style>
@import './index.css';
</style>
