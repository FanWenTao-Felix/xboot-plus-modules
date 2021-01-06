<template>
	<view class="product-hot">
		<image class="img" :src="datas.picUrl" mode="aspectFit"></image>
		<tag v-if="datas.tag" round color="#ffe7e5" text-color="#C81816" class="tag">{{datas.tag}}</tag>
		<view class="mt">
			<text class="brand">{{ datas.title }}</text>
			<text class="description">{{ datas.description }}</text>
			<text class="price">￥{{ datas.price }}</text>
		</view>
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
		}
	},

	data() {
		return {};
	}
};
</script>

<style lang="css">
.product-hot {
  position: relative;
}

.product-hot .img {
  width: 235rpx;
  height: 235rpx;
  border: 2rpx solid #f0f0f0;
  border-radius: 8rpx;
}

.product-hot .mt {
  z-index: 2;
  padding: 10rpx 15rpx 0 15rpx;
  width: 205rpx;
}

.product-hot .mt .brand {
  display: block;
  font-size: 26rpx;
  color: #333;
  overflow: hidden;
  text-overflow: ellipsis;
  white-space: nowrap;
}

.product-hot .mt .description {
  display: block;
  font-size: 20rpx;
  color: #7f7f7f;
  overflow: hidden;
  text-overflow: ellipsis;
  white-space: nowrap;
  margin-top: 5rpx;
}

.product-hot .mt .price {
  display: block;
  font-size: 26rpx;
  color: #C81816;
  margin-top: 5rpx;
}

.product-hot .tag {
  font-weight: 700;
  position: absolute;
  top: 5rpx;
  left: 15rpx;
}

.van-tag {
  border: 1rpx solid #C81816 !important;
  padding: 0.1em 0.5em !important;
}
</style>
