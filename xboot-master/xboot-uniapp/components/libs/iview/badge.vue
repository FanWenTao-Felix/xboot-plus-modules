<template>
	<view class="i-class i-badge">
		<slot></slot>
		<view class="i-badge-dot" v-if="dot"></view>
		<view class="i-badge-count i-class-alone" v-else-if="count !== 0">{{ finalCount }}</view>
	</view>
</template>

<script>
export default {
	props: {
		count: {
			type: Number,
			default: 0,
			observer: 'finalCount'
		},
		overflowCount: {
			type: Number,
			default: 99
		},
		dot: {
			type: Boolean,
			default: false
		}
	},
	computed: {
		finalCount() {
			return parseInt(this.count) >= parseInt(this.overflowCount) ? `${this.overflowCount}+` : this.count;
		}
	}
};
</script>
<style>
.i-badge {
	position: relative;
	display: inline-block;
	line-height: 1;
	vertical-align: middle;
}

.i-badge-count {
	position: absolute;
	transform: translateX(50%);
	top: -6px;
	right: 0;
	height: 16px;
	min-width: 16px;
	line-height: 16px;
	border-radius: 9px;
	background: #C81816;
	/* border: 1px solid transparent; */
	color: #fff;
	text-align: center;
	padding: 0 5px;
	font-size: 10px;
	white-space: nowrap;
	transform-origin: -10% center;
	z-index: 10;
	/* box-shadow: 0 0 0 1px #fff; */
	box-sizing: border-box;
	text-rendering: optimizeLegibility;
}

.i-badge-count-alone {
	top: auto;
	display: block;
	position: relative;
	transform: translateX(0);
}

.i-badge-dot {
	position: absolute;
	transform: translateX(-50%);
	transform-origin: 0 center;
	top: -4px;
	right: -8px;
	height: 8px;
	width: 8px;
	border-radius: 100%;
	background: #C81816;
	z-index: 10;
	box-shadow: 0 0 0 1px #fff;
}
</style>
