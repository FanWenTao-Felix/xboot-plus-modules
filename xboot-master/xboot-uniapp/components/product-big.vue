<template>
	<view class="product-big">
		<image :class="{ img: border == 'true', 'img-noborder': border != 'true' }" :src="datas.picUrl" background-size="cover" mode="aspectFit" lazy-load="true"></image>
		<tag v-if="datas.tag" round color="#ffe7e5" text-color="#C81816" class="tag">{{ datas.tag }}</tag>
		<text class="name">{{ datas.title }}</text>
		<text class="description">{{ datas.description }}</text>
		<text class="price">￥{{ datas.price }}</text>
	</view>
</template>

<script>
import tag from '@/components/libs/vant/tag.vue';
export default {
	components: {
		tag
	},
	props: {
		datas: {
			type: Object
		},
		border: {
			type: String,
			default: 'true'
		}
	},

	data() {
		return {};
	}
};
</script>

<style>
.product-big {
	position: relative;
}

.product-big .img {
	width: 320rpx;
	height: 320rpx;
	border: 1px solid #f0f0f0;
	border-radius: 0.2rem;
}

.product-big .img-noborder {
	width: 320rpx;
	height: 320rpx;
	border: none;
}

.product-big .name {
	display: block;
	padding: 5rpx 10rpx 5rpx 20rpx;
	overflow: hidden;
	font-size: 26rpx;
	color: #333;
	text-overflow: ellipsis;
	white-space: nowrap;
}

.product-big .description {
	padding: 0rpx 10rpx 5rpx 20rpx;
	display: block;
	font-size: 20rpx;
	color: #7f7f7f;
	overflow: hidden;
	text-overflow: ellipsis;
	white-space: nowrap;
}

.product-big .price {
	display: block;
	padding: 0rpx 10rpx 10rpx 20rpx;
	font-size: 26rpx;
	color: #C81816;
}

.product-big .tag {
	font-weight: 700;
	position: absolute;
	top: 10rpx;
	left: 15rpx;
}

.van-tag {
  border: 1rpx solid #C81816 !important;
  padding: 0.1em 0.5em !important;
}
</style>
