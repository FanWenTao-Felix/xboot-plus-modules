<template>
	<view class="container">
		<Icon name="shut" :size="26" @click="close" class="close"></Icon>
		<view class="wrap">
			<view class="title">欢迎使用XBoot</view>
			<view class="sub-title">输入手机号快捷登录/注册</view>
			<view class="login-from">
				<view class="line-cell">
					<input class="input" placeholder="请输入手机号码" maxlength="11" v-model="form.mobile" type="number" />
				</view>
				<view class="line-cell top28">
					<input class="input" v-model="form.code" placeholder="请输入验证码" maxlength="6" />
					<TButton :size="28" width="190rpx" height="60rpx" type="danger" :disabled="disabled" @click="sendCode">{{ btnText }}</TButton>
				</view>
				<TButton type="danger" @click="login">登录</TButton>
			</view>
		</view>
		<view class="bottom">
			<!-- #ifdef APP-PLUS -->
			<view class="social">
				<image class="right" src="/static/weixin.png" @click="socialLogin(1)"></image>
				<image class="right" src="/static/qq.png" @click="socialLogin(2)"></image>
				<image src="/static/weibo.png" @click="socialLogin(3)"></image>
			</view>
			<!-- #endif -->
			<view class="protocol">
				<checkbox-group @change="checkboxChange" class="check"><checkbox value="agree" :checked="true" class="tui-checkbox"></checkbox></checkbox-group>
				我已仔细阅读并同意
				<text class="protocol-red" @click="protocol(1)">《用户协议》</text>
				和
				<text class="protocol-red" @click="protocol(2)">《隐私政策》</text>
			</view>
		</view>

		<!--居中消息-->
		<Tips position="center" ref="toast"></Tips>
	</view>
</template>

<script>
import Icon from '@/components/libs/thor/icon.vue';
import TButton from '@/components/libs/thor/button.vue';
import Tips from '@/components/libs/thor/tips.vue';
export default {
	components: {
		Icon,
		TButton,
		Tips
	},
	data() {
		return {
			form: {
				mobile: '',
				code: ''
			},
			disabled: false,
			btnText: '获取验证码',
			mobile: '',
			code: '',
			agree: true
		};
	},
	methods: {
		login() {
			if (!this.agree) {
				this.$refs.toast.showTips({ msg: '您未同意我们的用户协议' });
				return;
			}
			if (!this.form.mobile) {
				this.$refs.toast.showTips({ msg: '请输入手机号' });
				return;
			}
			if (!this.form.code) {
				this.$refs.toast.showTips({ msg: '请输入您收到的短信验证码' });
				return;
			}
			uni.showModal({
			    title: '提示',
			    content: '登录成功',
				showCancel: false,
			    success: function (res) {
			        if (res.confirm) {
			            console.log('用户点击确定');
			        } 
			    }
			});
		},
		socialLogin(v) {
			let provider = ';';
			if (v == 1) {
				provider = 'weixin';
			} else if ((v == 2)) {
				provider = 'qq';
			} else if (v == 3) {
				provider = 'sinaweibo';
			}
			uni.login({
				provider: provider,
				success: function(res) {
					console.log(JSON.stringify(res));
					uni.getUserInfo({
						provider: provider,
						success: function(infoRes) {
							console.log(infoRes.userInfo);
						}
					});
				}
			});
		},
		sendCode() {
			if (!this.form.mobile) {
				this.$refs.toast.showTips({ msg: '请输入手机号' });
				return;
			}
			let reg = /^[1][3,4,5,6,7,8,9][0-9]{9}$/;
			if (!reg.test(this.form.mobile)) {
				this.$refs.toast.showTips({ msg: '手机号格式不正确' });
				return;
			}
			this.disabled = true;
			this.$refs.toast.showTips({ msg: '发送短信验证码成功' });
			this.doLoop(60);
		},
		doLoop(seconds) {
			seconds = seconds ? seconds : 60;
			this.btnText = seconds + 's后获取';
			let countdown = setInterval(() => {
				if (seconds > 0) {
					seconds--;
					this.btnText = seconds + 's后获取';
				} else {
					this.btnText = '获取验证码';
					this.disabled = false;
					clearInterval(countdown);
				}
			}, 1000);
		},
		checkboxChange(e) {
			if (e.detail.value[0] == 'agree') {
				this.agree = true;
			} else {
				this.agree = false;
			}
		},
		protocol() {
			uni.showToast({
				title: '点击了协议'
			});
		},
		close() {
			uni.navigateBack();
		}
	}
};
</script>

<style>
@import './login.css';
@import '/components/libs/thor/style.css';
</style>
