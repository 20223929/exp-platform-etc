import request from 'ecip-web/utils/request'

export const getData = (params, data) => {
  return request({
    url: 'api/v1/demo/tbEtcTransactionEexit/data',
    method: 'post',
    params: params,
    data: data || {}
  })
}
