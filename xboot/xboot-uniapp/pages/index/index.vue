<template>
	<view class="content">
		<!-- 搜索栏占位 -->
		<view class="nav-placeholder"></view>
		<!-- 背景色区域 -->
		<view class="nav-background" :style="{ backgroundColor: bannerBackground }"></view>
		<!-- 轮播图 -->
		<view class="banner-wrap">
			<swiper
				class="banner"
				indicator-dots="true"
				indicator-color="#e0e0e0"
				indicator-active-color="#fff"
				autoplay="true"
				interval="3000"
				duration="1000"
				@change="swiperChange"
			>
				<swiper-item v-for="(item, i) in banner" :key="i"><image :src="item.picUrl" background-size="cover" mode="aspectFit"></image></swiper-item>
			</swiper>
		</view>

		<!-- 快捷频道图标 -->
		<view class="menu">
			<view class="item" v-for="(item, i) in menus" :key="i">
				<image :src="item.picUrl" background-size="cover"></image>
				<text>{{ item.title }}</text>
			</view>
		</view>

		<view class="sections">
			<view class="promotion">
				<view class="promotion-top">
					<view class="promo-top-left">
						<view style="display: flex;align-items: center;">
							<text class="promo-time-title">限时购</text>
							<count-down :time="3600" :width="30" :height="30" :scale="true" color="#fff" bgcolor="#333"></count-down>
						</view>
						<view class="promo-product-wrap">
							<view class="promo-product">
								<image src="https://yanxuan.nosdn.127.net/87eb525e1a7998b7a88f45a86b912e01.jpg"></image>
								<view class="promo-price">
									¥239
									<text class="promo-price-origin">￥269</text>
								</view>
							</view>
							<view class="promo-product">
								<image src="https://yanxuan.nosdn.127.net/1979054e3a1c8409f10191242165e674.png"></image>
								<view class="promo-price">
									¥82.8
									<text class="promo-price-origin">￥88</text>
								</view>
							</view>
						</view>
					</view>
					<view class="promo-top-right">
						<text class="promo-title">新品首发</text>
						<view class="promo-product-wrap">
							<view class="promo-product">
								<image src="https://img14.360buyimg.com/n1/s450x450_jfs/t1/96982/2/15728/276279/5e723d96E92a1ae72/d9622726b24ea9e1.jpg"></image>
								<view class="promo-price">¥5699</view>
							</view>
							<view class="promo-product">
								<image src="https://img14.360buyimg.com/n1/jfs/t1/97121/2/15534/73762/5e72e974E5939984d/a4467fd935e68ab3.jpg"></image>
								<view class="promo-price">
									¥2999
									<text class="promo-price-origin">￥3199</text>
								</view>
							</view>
						</view>
					</view>
				</view>

				<view class="promotion-bottom">
					<view class="promo-b-wrap">
						<text class="promo-title">热卖榜单</text>
						<text class="promo-sub-title">大家都在买</text>
						<image src="https://yanxuan-item.nosdn.127.net/5ad3990d8d1ca731b56ee11d151facfd.png"></image>
					</view>
					<view class="promo-b-wrap">
						<text class="promo-title">精选超市</text>
						<text class="promo-sub-title red">10元挑好物</text>
						<image src="https://yanxuan-item.nosdn.127.net/1b8e4a484e128c28a050cd2bc0c64396.png"></image>
					</view>
					<view class="promo-b-wrap">
						<text class="promo-title">断货补单</text>
						<text class="promo-sub-title">补仓疯抢中</text>
						<image src="https://yanxuan-item.nosdn.127.net/f3017836b70b5e7f8c9a487bf45d496f.png"></image>
					</view>
					<view class="promo-b-wrap">
						<text class="promo-title">发现好货</text>
						<text class="promo-sub-title">大家都在买</text>
						<image src="https://yanxuan-item.nosdn.127.net/6cdb3da46a4b95b36dea89d6d47d3bd9.png"></image>
					</view>
				</view>
			</view>

			<view v-for="(item, index) in sections" :key="index">
				<!-- 热门板块 -->
				<view class="section hot" v-if="item.type == 2 && item.list.length > 0">
					<view class="h" hover-class="active">
						<text class="txt">{{ item.title }}</text>
						<Icon name="arrowright" :size="26"></Icon>
					</view>
					<scroll-view scroll-x>
						<view class="hot-wrap">
							<view class="item" v-for="(iitem, i) in item.list" :key="i"><product-hot :datas="iitem"></product-hot></view>
						</view>
					</scroll-view>
				</view>

				<!-- 大图带边框板块 -->
				<view class="section pick" v-if="item.type == 4 && item.list.length > 0">
					<view class="h" hover-class="active">
						<text class="txt">{{ item.title }}</text>
						<Icon name="arrowright" :size="26"></Icon>
					</view>
					<view class="pick-wrap">
						<view class="item" v-for="(iitem, i) in item.list" :key="i"><product-big :datas="iitem"></product-big></view>
					</view>
				</view>

				<!-- 大图无边框板块 -->
				<view class="section pick" v-if="item.type == 5 && item.list.length > 0">
					<view class="h" hover-class="active">
						<text class="txt">{{ item.title }}</text>
						<Icon name="arrowright" :size="26"></Icon>
					</view>
					<view class="pick-wrap">
						<view class="item" v-for="(iitem, i) in item.list" :key="i"><product-big :datas="iitem" border="false"></product-big></view>
					</view>
				</view>

				<!-- 两张长图板块 -->
				<view class="section layout-two" v-if="item.type == 3 && item.list.length > 0">
					<view class="layout-image-two" v-for="(iitem, i) in item.list" :key="i"><image class="layout-image-two" :src="iitem.picUrl" mode="aspectFit"></image></view>
				</view>
			</view>

			<view class="more"><text class="title">—— 更多内容,敬请期待 ——</text></view>
		</view>
	</view>
</template>

<script>
import countDown from '@/components/libs/thor/countdown.vue';
import Icon from '@/components/libs/thor/icon.vue';
import productHot from '@/components/product-hot.vue';
import productBig from '@/components/product-big.vue';
// 模拟数据
import { banner, menus, sections } from './data.js';
export default {
	components: {
		countDown,
		Icon,
		productHot,
		productBig
	},
	data() {
		return {
			bannerBackground: '#c8c8c8',
			banner: banner,
			menus: menus,
			sections: sections
		};
	},
	onLoad() {
		this.init();
	},
	methods: {
		init() {
			this.bannerBackground = this.banner[0].color;
		},
		swiperChange(e) {
			let index = e.detail.current;
			this.bannerBackground = this.banner[index].color;
		}
	},
	// #ifndef MP
	// 除了小程序的头部点击事件 标题栏input搜索框点击
	onNavigationBarSearchInputClicked: async function(e) {
		uni.showModal({
			title: '提示',
			content: '搜索框完善中',
			confirmColor: '#C81816',
			success: res => {
				if (res.confirm) {
				}
			}
		});
	},
	// 点击导航栏 buttons 时触发
	onNavigationBarButtonTap(e) {
		const index = e.index;
		if (index === 0) {
			// #ifdef APP-PLUS
			const pages = getCurrentPages();
			const page = pages[pages.length - 1];
			const currentWebview = page.$getAppWebview();
			currentWebview.hideTitleNViewButtonRedDot({
				index
			});
			// #endif
			uni.navigateTo({
				url: '/pages/notice/notice'
			});
		} else if (index === 1) {
			uni.scanCode({
				success: function(res) {
					console.log('条码类型：' + res.scanType);
					console.log('条码内容：' + res.result);
				}
			});
		}
	}
	// #endif
};
</script>

<style>
@import './index.css';
</style>
