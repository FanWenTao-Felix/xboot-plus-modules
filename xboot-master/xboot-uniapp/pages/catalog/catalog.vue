<template>
	<view class="catalog">
		<scroll-view class="nav" scroll-y="true">
			<view class="wrap" v-for="(item, i) in category" :key="i" @click="switchCategory(item)">
				<view :class="'item ' + (currentCategory.id == item.id ? 'active' : '')">{{ item.title }}</view>
			</view>
		</scroll-view>

		<scroll-view class="category" scroll-y="true">
			<view class="banner"><image class="image" :src="currentCategory.picUrl"></image></view>
			<view v-for="(item, index) in currentCategory.children" :key="index">
				<view v-if="item.title" class="header">{{ item.title }}</view>
				<view class="item-wrap">
					<view :class="'item ' + ((index + 1) % 3 == 0 ? 'last' : '')" v-for="(iitem, i) in item.children" :key="i">
						<image class="icon" :src="iitem.picUrl"></image>
						<text class="txt">{{ iitem.title }}</text>
					</view>
				</view>
			</view>
		</scroll-view>
	</view>
</template>

<script>
// 模拟数据
import { category } from './data.js';
export default {
	data() {
		return {
			category: category,
			currentCategory: {}
		};
	},
	onLoad() {
		this.init();
	},
	methods: {
		init() {
			if (!this.category || this.category.length < 1) {
				return;
			}
			// 默认选中第一个
			this.currentCategory = this.category[0];
		},
		switchCategory: function(e) {
			this.currentCategory = e;
		},
		handleClickBigCover: function() {
			let data = this.currentCategory;
			if (data.type == 0) {
				// 商品
				wx.navigateTo({
					url: '/pages/product/product?id=' + data.relateId
				});
			} else if (data.type == 1) {
				// 促销
				wx.navigateTo({
					url: '/pages/promotion/promotion?id=' + data.relateId
				});
			} else if (data.type == 1) {
				// 分类
				wx.navigateTo({
					url: '/pages/category/category?id=' + data.relateId
				});
			}
		},
		handleClick: function(e) {
			let data = e.currentTarget.dataset.value;
			if (data.type == 0) {
				// 商品
				wx.navigateTo({
					url: '/pages/product/product?id=' + data.relateId
				});
			} else if (data.type == 1) {
				// 促销
				wx.navigateTo({
					url: '/pages/promotion/promotion?id=' + data.relateId
				});
			} else {
				// 分类
				wx.navigateTo({
					url: '/pages/category/category?id=' + data.relateId
				});
			}
		}
	},
	// #ifndef MP
	// 除了小程序的头部点击事件 标题栏input搜索框点击
	onNavigationBarSearchInputClicked: async function(e) {
		console.log('点击了搜索框');
	}
	// #endif
};
</script>

<style>
@import './catalog.css';
</style>
