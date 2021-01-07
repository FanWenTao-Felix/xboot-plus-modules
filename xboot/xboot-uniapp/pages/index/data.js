export const banner = [{
		id: 1,
		relateId: 0, // 关联商品或其他ID
		title: '',
		type: 0, // 关联类型 0商品 1促销板块 2分类
		color: 'rgb(137, 137, 137)', // 沉浸式背景颜色
		picUrl: 'https://resource.smartisan.com/resource/fda5c3e61a71c0f883bbd6c76516cd85.png'
	},
	{
		id: 2,
		relateId: 0,
		title: '',
		type: 0,
		color: 'rgb(109,158,216)',
		picUrl: 'https://resource.smartisan.com/resource/w/white25wap.png'
	},
	{
		id: 3,
		relateId: 0,
		title: '',
		type: 0,
		color: 'rgb(112,46,54)',
		picUrl: 'https://resource.smartisan.com/resource/9402b4117bf1c1754dca08b52c98cca0.png'
	},
	{
		id: 4,
		relateId: 0,
		title: '',
		type: 0,
		color: 'rgb(239, 135, 120)',
		picUrl: 'https://resource.smartisan.com/resource/B/BS2000WAP.png'
	}
]

export const menus = [{
		id: 1,
		relateId: 0,
		title: 'IPhone 11',
		type: 0,
		picUrl: 'https://resource.smartisan.com/resource/5224f868cca31a8b913411ff9d69dcaf.png'
	},
	{
		id: 2,
		relateId: 0,
		title: '购买空净',
		type: 0,
		picUrl: 'https://resource.smartisan.com/resource/e98cfb0a63e8b8c80e5b87ca66bda64c.png'
	},
	{
		id: 3,
		relateId: 0,
		title: '新品配件',
		type: 0,
		picUrl: 'https://i.loli.net/2019/06/23/5d0f7e938c57070713.png'
	},
	{
		id: 4,
		relateId: 0,
		title: '服装',
		type: 0,
		picUrl: 'https://resource.smartisan.com/resource/75892aebb63f998fa9b37e9a18984a98.png'
	},
	{
		id: 5,
		relateId: 0,
		title: '更多',
		type: 0,
		picUrl: 'https://i.loli.net/2019/06/23/5d0f7e938cbee56873.png'
	}
]

export const sections = [{
		id: 3,
		title: '',
		type: 3, // 板块类型 两张板块
		sortOrder: 1,
		list: [{
				id: 1,
				relateId: 0,
				type: 0,
				picUrl: 'https://resource.smartisan.com/resource/e/erfenzhiyiqingrenjieapp.png'
			},
			{
				id: 2,
				relateId: 0,
				type: 0,
				picUrl: 'https://resource.smartisan.com/resource/s/shangchengguanggaowei.png'
			}
		]
	},
	{
		id: 4,
		title: '热门商品',
		type: 2, // 板块类型 横向商品板块
		relateId: 1, // 关联促销分类
		sortOrder: 2,
		list: [{
				id: 1,
				relateId: 0,
				title: 'MacBook Pro 16',
				description: 'Apple 2019新品',
				price: 18999.0,
				type: 0,
				picUrl: 'https://img12.360buyimg.com/n1/s450x450_jfs/t1/64979/31/15492/115459/5dd3d4f2E75b0a9a6/95c273eda00e67c0.jpg'
			},
			{
				id: 2,
				relateId: 0,
				title: '畅呼吸空气智能净化器',
				description: '超强净化能力，超低噪音',
				price: 1299.0,
				type: 0,
				picUrl: 'https://resource.smartisan.com/resource/6ff92d05a3bfab4fad489ca04d3eea5a.png'
			},
			{
				id: 3,
				relateId: 0,
				title: 'iPhone 11',
				description: '128GB 白色',
				price: 5999.0,
				type: 0,
				picUrl: 'https://img10.360buyimg.com/n1/s450x450_jfs/t1/52252/35/10516/124064/5d7808e0E46202391/7100f3733a1c1f00.jpg'
			},
			{
				id: 4,
				relateId: 0,
				title: 'Smartisan 颈挂蓝牙耳机',
				description: '圈铁一体代表作',
				price: 199.0,
				type: 0,
				picUrl: 'https://resource.smartisan.com/resource/a5b6bf1f38fb88dceeb1e917bec288da.jpg'
			},
			{
				id: 5,
				relateId: 0,
				title: '卫衣 开衫 热血',
				description: '风格简洁、舒适服帖',
				price: 299.0,
				type: 0,
				picUrl: 'https://resource.smartisan.com/resource/ff8106afb5fe0ed8ec23e3594766b4f7.png'
			}
		]
	},
	{
		id: 5,
		title: '官方精选',
		type: 4, // 大图商品带边框板块
		relateId: 2,
		sortOrder: 5,
		list: [{
				id: 1,
				relateId: 0,
				title: '坚果 Pro 3',
				description: '漂亮得不像实力派',
				price: 2399.0,
				type: 0,
				picUrl: 'https://resource.smartisan.com/resource/f195e666e089d4e3775ce67d8e9523ce.png',
				tag: '满减'
			},
			{
				id: 2,
				relateId: 0,
				title: 'AirPods Pro 3',
				description: '主动降噪入耳式',
				price: 1999.0,
				type: 0,
				picUrl: 'https://img12.360buyimg.com/n1/jfs/t1/102563/13/1048/41791/5db8fb68E62625ebc/de3eec96660974d4.jpg'
			},
			{
				id: 3,
				relateId: 0,
				title: '坚果 Pro 3 足迹保护套',
				description: '德国天文学家开普勒出生',
				price: 49.0,
				type: 0,
				picUrl: 'https://resource.smartisan.com/resource/db1f9c8eadd0164a34e73465a34776a3.jpg'
			},
			{
				id: 4,
				relateId: 0,
				title: 'Beats Solo3 Wireless',
				description: '新款 学院白',
				price: 1398.0,
				type: 0,
				picUrl: 'https://img14.360buyimg.com/n1/s450x450_jfs/t1/35385/29/8969/138101/5d00d3f8E6beddf80/874efe5a68470050.jpg'
			}
		]
	},
	{
		id: 6,
		title: '',
		type: 3, // 板块类型 两张板块
		sortOrder: 6,
		list: [{
				id: 1,
				relateId: 0,
				type: 0,
				picUrl: 'https://resource.smartisan.com/resource/3a7c77edcd70a9d3621bc3e7d0fba1c1.png'
			},
			{
				id: 2,
				relateId: 0,
				type: 0,
				picUrl: 'https://resource.smartisan.com/resource/4bf08546b25b1527cc715a9717db6327.png'
			}
		]
	},
	{
		id: 5,
		title: '品牌周边',
		type: 5, // 大图商品无边框板块
		relateId: 3,
		sortOrder: 5,
		list: [{
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
	}
]
