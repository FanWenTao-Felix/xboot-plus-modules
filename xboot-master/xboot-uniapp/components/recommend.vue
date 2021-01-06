<template>
	<view class="recommend">
		<view class="guess-txt">猜你喜欢</view>
		<view class="recommend-wrap">
			<view class="item" v-for="(item, i) in recommend" :key="i" @click="handleClick(item)"><product-big :datas="item" border="false"></product-big></view>
		</view>
	</view>
</template>

<script>
import productBig from './product-big';
export default {
	components: {
		productBig
	},
	props: {},
	data() {
		return {
			recommend: [
				{
					id: 1,
					relateId: 0,
					title: 'Smartisan T恤 薛定谔',
					description: '风格简洁、舒适服帖',
					price: 149.0,
					type: 0,
					picUrl: 'https://resource.smartisan.com/resource/22f9e824c1cf7e8fad3d432ee494b932.png'
				},
				{
					id: 2,
					relateId: 0,
					title: '记事本',
					description: '优质米色纸、不洇不透',
					price: 49.0,
					type: 0,
					picUrl: 'https://resource.smartisan.com/resource/4a38a3678f151ec9c022f5f676c2b7da.jpg'
				},
				{
					id: 3,
					relateId: 0,
					title: '坚果砖式蓝牙小音箱',
					description: '一款设计出色、音质出众的随身音箱',
					price: 149.0,
					type: 0,
					picUrl: 'https://resource.smartisan.com/resource/c44f0ab4da5591fc3d0f82b7ac0f4f65.jpg'
				},
				{
					id: 4,
					relateId: 0,
					title: '坚果彩虹数据线',
					description: '七彩配色随机发货，为生活增添一份小小惊喜',
					price: 19.0,
					type: 0,
					picUrl: 'https://resource.smartisan.com/resource/82aab62886740f165a3631ce6cffe895.jpg'
				},
				{
					id: 5,
					relateId: 0,
					title: '明信片',
					description: '优质卡纸、包装精致、色彩饱满',
					price: 9.9,
					type: 0,
					picUrl: 'https://resource.smartisan.com/resource/5ff83a138b1186b0cdf2c76fee2b6e44.jpg'
				},
				{
					id: 6,
					relateId: 0,
					title: '任天堂发售红白机',
					description: '100% 美国 SUPIMA 棉、舒适拉绒质地',
					price: 149.0,
					type: 0,
					picUrl: 'https://resource.smartisan.com/resource/804edf579887b3e1fae4e20a379be5b5.png'
				}
			]
		};
	},
	methods: {
		handleClick(e) {
			let id = e.id;
			uni.navigateTo({
				url: '/pages/product/product?id=' + id
			});
		}
	}
};
</script>
<style>
.recommend {
	background: #fff;
}

.guess-txt {
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100rpx;
	font-size: 26rpx;
	margin-top: 20rpx;
}

.recommend-wrap {
	display: flex;
	flex-wrap: wrap;
	padding: 0 15rpx 130rpx 40rpx;
}

.recommend .item {
	width: 320rpx;
	margin-top: 25rpx;
	margin-right: 25rpx;
}
</style>
