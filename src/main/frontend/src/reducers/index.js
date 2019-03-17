import {combineReducers} from 'redux'
import { reducer as formReducer } from 'redux-form'
import user from './user.reducer'

export default combineReducers({
    user,
    form: formReducer
})